package com.sit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String username = req.getParameter("user_name");
		String password=req.getParameter("password");
		String address=req.getParameter("addr");
		String name=req.getParameter("name");
		
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		System.out.println("Address: "+address);
		System.out.println("Name: " +name);
		System.out.println("Registration Successfull");
		
		res.sendRedirect("success.jsp");
			
		     
	}

}
