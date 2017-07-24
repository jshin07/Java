package com.jenny.counter.controllers;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {
	@RequestMapping("/")
	public String index(HttpSession session){
		if(session.getAttribute("count") == null){
			session.setAttribute("count",0);			
		} else {
			int num = (Integer) session.getAttribute("count");
			num++;
			session.setAttribute("count", num);
		}		
		return "index.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session){
		session.invalidate();
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String showCounter(){
		return "count.jsp";
	}

}

