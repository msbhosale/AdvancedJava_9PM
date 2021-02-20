package com.happycoding.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println(username + " " + password);

		if (username.equals("admin")) {
			
//			RequestDispatcher rd = request.getRequestDispatcher("Welcome");
//			rd.forward(request, response);
			
			HttpSession session = request.getSession();
			
			session.setAttribute("username", username);
			
			response.sendRedirect("Welcome");
			
			// Stateless protocol - it doesn't remember from which device the previous request came
			
		} else {
			
//			RequestDispatcher rd = request.getRequestDispatcher("login.html");
//			rd.forward(request, response);
			
			response.sendRedirect("login.html");
			
		}
		
		
		
		
		
		
		

		// Servlet Collabration
		// Calling of one servlet from another servlet
		
		// Previous request is not completely deleted
		// Data gets re-submitted when we refresh the page
		// Service method
		
		// Solution is : sendRedirect method
		
		
		
		
		

		// Check if the username and password are valid
		// Use JDBC to fetch the Data
		// Use different classes for other operations

		// If valid
		// Print Welcome - in Green Color
		// Else print Invalid User - in Red Color
	}

}

/*
 * doGet vs doPost ----------------- 1. doGet >> Data is sent through URL and is
 * visible, doPost data is hidden (??) 2. doGet has limitation while sending the
 * data through the URL (??) 3. doGet is used for getting the Data 4. doPost is
 * used when sending the data to the server 5. doPost is used when sending the
 * sensitive information
 * 
 * =============
 * 
 * 
 *  HTTP Session
 *  
 *  Its a time from Login to Logout the Application
 *  Generally, where is your application entry point you start the session
 *  
 *  How to use session?
 *  
 *  - Create HTTPSession Obj
 *  - Set data in session using setAttribute method
 *  - Data to be set is a key-value Pair
 *  - Access the Data using getAttribute method passing the key
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
