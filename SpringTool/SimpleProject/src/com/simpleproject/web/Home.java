package com.simpleproject.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String first = request.getParameter("first");
		String last = request.getParameter("last");
		String language = request.getParameter("language");
		String homeTown = request.getParameter("hometown");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(first == null){ 
			first = "Unknown";
		}
		if(last == null){
			last = "Unknown";
		}
		if(language == null){
			language = "Unknown";
		}
		if(homeTown == null){
			homeTown = "Unknown";
		}
		else{
			first= first;
			last = last;
			language= language;
			homeTown= homeTown;
		}
		
		out.write("<h1> Welcome, " + first + " " + last+ "</h1>");
		out.write("<h4> Your favorite language is : " + language + "<h4>");
		out.write("Your hometowm is: " + homeTown + "<h4>");
		

	
		

	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
