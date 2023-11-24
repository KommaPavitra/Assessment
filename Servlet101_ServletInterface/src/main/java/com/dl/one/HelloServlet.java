package com.dl.one;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class HelloServlet implements Servlet {
	private ServletConfig config;
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");
		return config;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo Method Invoked");
		return "getServletInfo";
	
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
				System.out.println("Init Method Invoked");
				
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Service Method Invoked");
		PrintWriter writer = response.getWriter();
		StringBuffer sb = new StringBuffer("Hello World Servlets");
		writer.print("StringBuffer called: " + sb);
	}
	@Override
	public void destroy() {
		System.out.println("Destroty method Invoked");
		
	}
	


   
}
