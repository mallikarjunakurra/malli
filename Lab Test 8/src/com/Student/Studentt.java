package com.Student;

public class Studentt {

	private String id;
	private String name;
	private String contact;
	
	public Studentt()
	{
		super();
	}
	
	public Studentt(String name, String id, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		System.out.println("name: "+name+"\nID  : "+id+"\nContact: "+contact);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}
