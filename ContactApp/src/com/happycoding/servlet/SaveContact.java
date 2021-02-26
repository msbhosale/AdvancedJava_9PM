package com.happycoding.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.happycoding.bean.Contact;
import com.happycoding.dao.ContactDAO;

public class SaveContact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		String emailId = request.getParameter("emial-id");
		
		Contact theContact = new Contact(id, name, number, emailId);
		
		ContactDAO contactDAO = new ContactDAO();
		contactDAO.save(theContact);
		
		response.sendRedirect("ViewAllContacts");
	}
}