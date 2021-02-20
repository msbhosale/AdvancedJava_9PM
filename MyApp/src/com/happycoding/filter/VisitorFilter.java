package com.happycoding.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class VisitorFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("VISITER Filter Called");
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		HttpSession httpSession = httpServletRequest.getSession();
		
		String username = (String) httpSession.getAttribute("username");
		
		System.out.println("Welcome is visited by "+username);
		
		chain.doFilter(request, response);
	}

}
