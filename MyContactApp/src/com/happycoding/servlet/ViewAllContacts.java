package com.happycoding.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.happycoding.bean.Contact;
import com.happycoding.dao.ContactDAO;

public class ViewAllContacts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		ContactDAO cd = new ContactDAO();
		
		List<Contact> contactList = cd.getAll();
		
		writer.write("<a href='add-new-contact.html'> Add New Contact </a>");
		writer.write("<br>");
		
		writer.write("<table style='border: 1px solid'>");
		writer.write("<tr>");
		writer.write("<td>Id</td>");
		writer.write("<td>Name</td>");
		writer.write("<td>Number</td>");
		writer.write("</tr>");

		for (Contact c : contactList) {

			writer.write("<tr>");
			writer.write("<td>" + c.getId() + "</td>");
			writer.write("<td>" + c.getName() + "</td>");
			writer.write("<td>" + c.getNumber() + "</td>");
			writer.write("</tr>");

		}

		writer.write("</table>");
	}
}