package com.edumentorappliaction;

//class to represent an Instructor
public class Instructor extends User{

	//constructor to initialize instructor
	public Instructor(String name, String email, int userId) {
		super(name, email, userId);
	}

	//method to display details
	@Override
	public void displayDetails() {
		System.out.println("----Instructor details-----");
		super.displayDetails();
	}
	
}
