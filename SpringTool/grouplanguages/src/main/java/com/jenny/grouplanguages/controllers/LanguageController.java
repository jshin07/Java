package com.jenny.grouplanguages.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jenny.grouplanguages.models.Language;
import com.jenny.grouplanguages.services.LanguageService;

@Controller
@RequestMapping("/languages")
public class LanguageController {
	private LanguageService languageService;
	
	public LanguageController(LanguageService languageService){
		this.languageService =languageService;
	}
	
	@RequestMapping("")
	public String languages(Model model){
		model.addAttribute("language",new Language());
		model.addAttribute("languages", languageService.all());	
		return "languages.jsp";
	}
	
	@PostMapping("/new")
		public String create(@Valid @ModelAttribute("language") Language language, BindingResult result, RedirectAttributes flash){
			if(result.hasErrors()){
				flash.addFlashAttribute("errs",result.getAllErrors());
				return "redirect:/languages";
			} else {
				languageService.create(language);
				return "redirect:/languages";
			}			
		}
	
	@RequestMapping("/show/{index}")
	public String show(@PathVariable ("index") int index , Model model ){
		Language language =languageService.findLanguage(index);
		model.addAttribute("language", language);
		return "language.jsp";
	}
	
	@RequestMapping("/edit/{index}")
	public String edit(@PathVariable ("index") int index, Model model){
		Language language = languageService.findLanguage(index);
		if (language != null){
			model.addAttribute("language", language);
			return "editLanguage.jsp";
		}else {
			return "redirect:/languages";
	    }
	}
		
	  @PostMapping("/edit/{id}")
	  public String update(@PathVariable("id") int id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
	      if (result.hasErrors()) {
	          return "editLanguage.jsp";
	      }else{
	          languageService.update(id, language);
	          return "redirect:/languages";
	      }		
	}
	
	  @RequestMapping(value="/delete/{id}")
	  public String delete(@PathVariable("id") int id) {
	      languageService.delete(id);
	      return "redirect:/languages";
	  }		

	
	
}
