package com.edumentorappliaction;

//class to represent a general user
public abstract class User {
	//User class attributes
	protected String name;
	protected String email;
	protected int userId;
	
	//constructor to initialize User class attributes
	public User(String name, String email, int userId) {
		this.name = name;
		this.email = email;
		this.userId = userId;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("ID: "+userId);
	}
	
}
