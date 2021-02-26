package com.happycoding.test;

import java.util.List;

import com.happycoding.bean.Contact;
import com.happycoding.dao.ContactDAO;

public class TestApp {

	public static void main(String[] args) {
		
		ContactDAO cd = new ContactDAO();
		
		Contact myContact = new Contact(3, "Samrath", "12345", "samrth@gmail.com");
		
		cd.save(myContact);
		
		System.out.println("Saved");
		
		List<Contact> contactList = cd.getAll();
		
		for(Contact theContact : contactList) {
			
			System.out.println(theContact);
			
		}
	}
}