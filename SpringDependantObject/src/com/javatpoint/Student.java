package com.javatpoint;

public class Student {

	private int id;
	private String name;
	private String subject;
	private Address address;

	public Student(int id, String name, String subject, Address address) {
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.address = address;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	void show(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());  
	} 
}
