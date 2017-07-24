package com.jenny.learningplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class Index {
	@RequestMapping("")
	public String showindex(){
		return "index.jsp";
	}
}
