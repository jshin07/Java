package com.jenny.randomword.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.date.datetime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String count =(String) session.getAttribute("count");
		
		String uuid= UUID.randomUUID().toString();
		uuid = uuid.toString().replaceAll("-", "").substring(0,10);
			
		session.setAttribute("uuid", uuid);
	
		Integer num =0;
		
		
		if (count !=null){
			num= Integer.parseInt(count);
			num += 1;
			count= num.toString();
			session.setAttribute("count", count);
		} else {
			session.setAttribute("count", "0");
		}
		
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy - hh:mm:ss a");
		request.setAttribute("time", formatter.format(date));
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		view.forward(request, response);    
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
