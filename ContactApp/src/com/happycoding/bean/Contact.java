package com.happycoding.bean;

public class Contact {
	
	private int id;
	private String name;
	private String number;
	private String emailId;
	
	public Contact() {
		
	}
	
	public Contact(int id, String name, String number, String emailId) {
		
		this.id = id;
		this.name = name;
		this.number = number;
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", number=" + number + ", emailId=" + emailId + "]";
	}
	
}
