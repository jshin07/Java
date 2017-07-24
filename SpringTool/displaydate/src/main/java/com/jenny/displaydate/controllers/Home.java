package com.jenny.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Home {
	@RequestMapping("/")
	public String showIndex(){
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String showDate(Model model){
		Date date = new Date();
		model.addAttribute("currentDate", date);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String showTime(Model model){
		Date time = new Date();
		model.addAttribute("currentTime", time);
		return "time.jsp";
	}
	



}



