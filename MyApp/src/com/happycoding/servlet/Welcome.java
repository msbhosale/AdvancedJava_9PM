package com.happycoding.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Welcome extends HttpServlet {

	private static final long serialVersionUID = 1L;

//	@Override
//	public void init() {
//		
//		System.out.println("Init called");
//	}
//	
//	@Override
//	public void destroy() {
//		
//		System.out.println("Destroy called");
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		System.out.println("Welcome called");
		
		PrintWriter writer = response.getWriter();
		
		HttpSession session = request.getSession();

		String username = (String) session.getAttribute("username");

		writer.write("<h1> Welcome to Servlet " + username + "</h1>");
		writer.write("<br>");
		writer.write("<a href='LogOut'> Log out </a>");

	}

}
/*
 * What is a Servlet?
 * 
 * - Its a Java class - It runs on a Web Server (Apache Tomcat) - It accepts a
 * request (Web / HTTP) - It gives a response to the request - It generates
 * dynamic HTML response / content - Servlet is an API i.e. it has predefined
 * Classes, Interfaces ===== Sending Data to the Servlet
 * 
 * - Through URL : 14 Feb, 2021
 * 
 * - Data comes in key-value pair - Data is separated from Servlet by ? - Data
 * is called as Parameter - Parameters are separated by &
 * 
 * - Through HTML Form : Later ===== Homework
 * 
 * Task 1: - Servlet to accept one name / username - Convert the name in
 * uppercase, lowercase and print it on browser - Print how many characters in
 * it
 * 
 * 
 * Task 2: - Servlet to accept one number - Print its Square - Print its Cube -
 * Print its Table
 * 
 * Task 3: - Servlet to accept two numbers - Print its Addition - Subtaction -
 * Division - Multiplication
 * 
 * #Advanced task - Servlet to accept one roll number - What ever data it has
 * just print
 * 
 * 
 * 
 * # Life cycle of a Servlet
 * 
 * - ServletContainer creates obj of the servlet - init method called only once
 * in its life cycle - service method - indirect method - doGet or doPost - by
 * default it calls doGet method
 * 
 * - destroy method - to call this method we have to depend on Server
 * 
 * 
 * 
 * 
 * // Login Example
 * 
 * - Login Page - Form - Servlet to Accept the Data - Process the Data
 * 
 * 
 * 
 * 
 * 
 * 
 */