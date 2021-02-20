package com.happycoding.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.happycoding.bean.Contact;

public class ContactDAO {

	private final String DATABASE_URL = "jdbc:mysql://localhost:3306/happycoding";
	private final String USER = "root";
	private final String PASSWORD = "root1234";

	public List<Contact> getAll() {

		List<Contact> contactList = new ArrayList<>();

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

			PreparedStatement pst = con.prepareStatement("select * from contact");

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				Contact theContact = new Contact();

				theContact.setId(rs.getInt("id"));
				theContact.setName(rs.getString("name"));
				theContact.setNumber(rs.getString("number"));
				theContact.setEmailId(rs.getString("email_id"));

				contactList.add(theContact);

			}

		} catch (Exception e) {

			System.out.println("Exception occured " + e.getMessage());
		}

		return contactList;
	}

	public void save(Contact theContact) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			
			String query = "insert into contact values (?,?,?,?)";

			Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, theContact.getId());
			pst.setString(2, theContact.getName());
			pst.setString(3, theContact.getNumber());
			pst.setString(4, theContact.getEmailId());
			
			pst.execute();
			

		} catch (Exception e) {

			System.out.println("Exception occured " + e.getMessage());
		}
	}

}