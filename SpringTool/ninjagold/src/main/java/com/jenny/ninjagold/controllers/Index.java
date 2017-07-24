package com.jenny.ninjagold.controllers;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Index {
	@RequestMapping("/")
	public String showindex(HttpSession session){
		if(session.getAttribute("gold") == null){
			session.setAttribute("gold",0);		
			session.setAttribute("result", "");
		} 		
		return "index.jsp";
	}

	@RequestMapping(path="/process/{id}", method=RequestMethod.POST)
		public String result(@PathVariable int id, HttpSession session){
		Random rand = new Random();
		String result= "";
		int gold= 0;
		
		switch(id) {
			case 1: 
				gold= rand.nextInt(10)+10;
				result= "You entered a farm and earned " + gold + " gold.";
				break;
			case 2: 
				gold=rand.nextInt(5)+5;
				result= "You entered a cave and earned " + gold + " gold.";
				break;
			case 3: 
				gold=rand.nextInt(2)+3;
				result= "You entered a house and earned " + gold + " gold.";
				break;
			case 4: 
				gold=rand.nextInt(100)-50;
				if(gold<0){
					result= "You entered a casino and lost " +gold + " gold.";
				} else {
					result= "You entered a casino and earned " +gold + " gold.";
				}
				break;
			}
		
		session.setAttribute("gold",(Integer)session.getAttribute("gold")+gold);
		session.setAttribute("result", (String)session.getAttribute("result")+ result+ "\n");

		return "redirect:/";
	}

}
