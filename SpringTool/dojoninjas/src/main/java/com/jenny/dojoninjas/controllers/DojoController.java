package com.jenny.dojoninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jenny.dojoninjas.models.Dojo;
import com.jenny.dojoninjas.models.Ninja;
import com.jenny.dojoninjas.services.DojoService;
import com.jenny.dojoninjas.services.NinjaService;

@Controller
@RequestMapping("/")
public class DojoController {
	private DojoService dojoService;
	private NinjaService ninjaService;
	
	public DojoController(DojoService dojoService, NinjaService ninjaService){
		this.dojoService= dojoService;
		this.ninjaService= ninjaService;
	}
	
	@RequestMapping("/dojos/new")
	public String dojos(@ModelAttribute("dojos")Dojo dojo){
		return "dojos.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String dojos(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, RedirectAttributes flash){
		if(result.hasErrors()){
			flash.addFlashAttribute("errs", result.getAllErrors());
			return "redirect:/dojos/new";
		}else{
			dojoService.create(dojo);
			return "redirect:/ninjas/new";
		}
	}
	
	@RequestMapping("/ninjas/new")
	public String ninjas(@ModelAttribute("ninja")Ninja ninja, Model model){
		model.addAttribute("dojos",dojoService.all());
		return "ninjas.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String info(@Valid @ModelAttribute("ninja")Ninja ninja, Model model,  BindingResult result, RedirectAttributes flash ){
		if(result.hasErrors()){
			flash.addFlashAttribute("errs", result.getAllErrors());
			return "redirect:/ninjas/new";
		}else{
			String id= (String) result.getFieldValue("dojo.id");
			ninjaService.create(ninja);
			return "redirect:/dojos/"+id;
		}
	}
	
	@RequestMapping("/dojos/{id}")
	public String info(@PathVariable("id")Long id, Model model){
		Dojo dojo =dojoService.findById(id);
		model.addAttribute("dojos", dojo);
		model.addAttribute("ninjas", ninjaService.all());
		return "dojoinfo.jsp";
	}
	
	
	
	
	
	
}
