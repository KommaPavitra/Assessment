package com.dl.one;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pword");
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		//equals() : content comparison
		if(username.equals("SaiKiran") && password.equals("Admin")) {
			response.sendRedirect("https://www.google.com");
			//writer.print("Welcome " + username);
		}else {
			response.sendError(808, "UserName or Password is Incorrect");
			writer.print("Uername or Password is invalid");
		}
	}
//Get data not secure what you are sending it will show in URL   
 //to access data we use get
  //send data post
    

}
