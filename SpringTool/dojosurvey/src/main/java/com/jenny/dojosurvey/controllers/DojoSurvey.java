package com.jenny.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class DojoSurvey {
	@RequestMapping("")
	public String index(){
		return "index.jsp";
	}
		
	@RequestMapping(path="/process", method=RequestMethod.POST)
	public String process(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="lang") String lang, @RequestParam(value="comment") String comment, HttpSession session){
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("lang", lang);
		session.setAttribute("comment", comment);	
		System.out.println(name);
		System.out.println(location);
			return "redirect:/result";
		}
				
	@RequestMapping("/result")
	public String result(){
		return "res.jsp";
	}


	@RequestMapping("/back")
	public String back(HttpSession session){
		session.invalidate();
		return "redirect:/";
	}

	
}


