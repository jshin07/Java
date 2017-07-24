package com.jenny.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Index {

	public String index(){
		return "forward:/index.html";
	}
	
	@RequestMapping("/aboutMe")
	public String about(){
		return "forward:/aboutme.html";		
	}
		
	@RequestMapping("/showprojects")
	public String project(){
		return "forward:/projects.html";
	}		
}


