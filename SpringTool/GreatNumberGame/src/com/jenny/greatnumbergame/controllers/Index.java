package com.jenny.greatnumbergame.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		view.forward(request, response);     
	}
	
	public int randNum(){
		return new Random().nextInt(50)+1;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result = "";
		HttpSession session = request.getSession();	
		
		if (session.getAttribute("num")== null){
			session.setAttribute("num", randNum());

		} else {
			int sv =(Integer) session.getAttribute("num");
			int cl= Integer.parseInt(request.getParameter("guess"));
			System.out.println(sv);
			
			if(sv == cl){
				result = "You won";			
				session.setAttribute("num", sv);
				sv= randNum();
			} else if (sv > cl){
				result = "Too low";
			} else {
				result = "Too high";
			}

		}
		
		
		request.setAttribute("result", result);

		
		
		doGet(request, response);
	}

}
