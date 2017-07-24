package com.jenny.license.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jenny.license.models.License;
import com.jenny.license.models.Person;
import com.jenny.license.services.LicenseService;
import com.jenny.license.services.PersonService;

@Controller
@RequestMapping("/license")
public class LicenseController {
	private PersonService personService;
	private LicenseService licenseService;
	
	public LicenseController(PersonService personService, LicenseService licenseService){
		this.personService=personService;
		this.licenseService=licenseService;
	}
	
	@RequestMapping("/create")
	public String newperson(@ModelAttribute("person") Person person){
		return "newperson.jsp";
	}	

	
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("person") Person person, BindingResult result, RedirectAttributes flash){
		if(result.hasErrors()){
			flash.addFlashAttribute("errs", result.getAllErrors());
			return "redirect:/license/create";
		}else{
			personService.create(person);
			return "redirect:/license/new";
		}
		
	}
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
	
	@RequestMapping("/new")
	public String newlicense(@ModelAttribute("license") License license, Model model){
		System.out.println("**********************");
		ArrayList<Person> person = personService.all();
		System.out.println(person);
		System.out.println("work?");
		model.addAttribute("persons", person);
		return "newlicense.jsp";
	}	
	
	@PostMapping("/new")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result, RedirectAttributes flash){
		if(result.hasErrors()){
			flash.addFlashAttribute("errs", result.getAllErrors());
			return "redirect:/license/new";
		}else{
			String id= (String) result.getFieldValue("person.id");
			int i = id.length();
			
			String temp= "";
			while (i<5){
				temp = temp+"0";
				i++;
			}
			String number= temp + id;
			license.setNumber(number);
			licenseService.create(license);
			
			return "redirect:/license/info/"+id;
		}		
	}
	
	@RequestMapping("/info/{id}")
	public String info(@PathVariable("id") Long id, Model model){
		Person person = personService.findById(id);
		License license =licenseService.findById(id);
		model.addAttribute("person", person);
		model.addAttribute("license", license);
		
	
		return "info.jsp";
	}
	
	
	
}
