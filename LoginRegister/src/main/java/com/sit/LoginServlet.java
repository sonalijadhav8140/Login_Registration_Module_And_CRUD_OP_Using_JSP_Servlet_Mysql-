package com.sit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
		
		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			String username = req.getParameter("user_name");
			String password = req.getParameter("password");
			
			System.out.println("Username: "+username);
			System.out.println("Password :"+password);
			
			PrintWriter out=res.getWriter();
			
			if(username.equals("sonali") && (password.equals("sonali@123")))
			{
				
				//res.sendRedirect("success.jsp");
				req.setAttribute("myname", username);
				req.setAttribute("Mypassword", password);
				RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
				rd.forward(req,res);
				
			}
			
			else {
				
				
				out.print("<h1 style='color:red'>Invalid Username And Password..!</h1>");
				
				res.setContentType("text/html");
				RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
				rd.include(req, res);
				
			}
			
		}

	}


