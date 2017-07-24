package com.jenny.languagereloaded.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
@RequestMapping("/languages")
public class LanguageControllers {
	private LanguageService languageService;
	
	public LanguageController(LanguageService languageService);
		this.languageService= languageService;
		
	@RequestMapping("")
	public String languages(Model model){
		
	}
		
}
