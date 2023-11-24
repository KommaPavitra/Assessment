package com.dl.one;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


 

public class Eg1 extends GenericServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
    
		PrintWriter writer = response.getWriter();	
		writer.print("Service() Method Invoked");
		StringBuffer sb = new StringBuffer("Hello world Service");
		System.out.println(sb);
		}
	       
        

}
