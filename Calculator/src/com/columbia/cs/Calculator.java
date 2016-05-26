package com.columbia.cs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {

	protected void doGet(HttpServletRequest request, 
		      HttpServletResponse response) throws ServletException, IOException {
		    String username = request.getParameter("Username");
		    String password = request.getParameter("Password");
		    PrintWriter writer = response.getWriter();
		    response.setContentType("text/html");
		    if(authenticate(username,password)){
		    	writer.write("Hello "+username+" "+password);
		    }else{
		    	writer.write("You entered a wrong Username or Password!");
		    }
	}
	
	protected boolean authenticate(String username, String password){
		if(username.equals("ap3341") && password.equals("ap3341")){
			return true;
		}
		return false;
	}
}
