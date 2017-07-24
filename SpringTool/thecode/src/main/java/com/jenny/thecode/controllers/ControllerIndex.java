package com.jenny.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller("/")
public class ControllerIndex {
	@RequestMapping("")
	public String index(){
		return "index.jsp";
	}
	
	@RequestMapping(path= "/submit", method=RequestMethod.POST)
	public String code(@RequestParam(value="code") String input, RedirectAttributes redirectAttributes){
//		System.out.println(code.getClass());
		String code= "bushido";
		if (code.equals(input)){
			return "code.jsp";
		} else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}		
	}

}

