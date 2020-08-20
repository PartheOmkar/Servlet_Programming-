package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet {

	// to perform any operation we requaird a method or function
	// in servlet programming we use service() method
	// can we use other method name ? -> No service is method belong to servlet life cycle
	// request get the user request 
	// responce send the data to user
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int add = i+j;
		//getWriter is return an object of PrintWriter 
		PrintWriter out = res.getWriter();
		
		out.println("the Result is :"+add);
		
	}
}
