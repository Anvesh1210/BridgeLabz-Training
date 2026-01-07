package com.eventeaseapplication;

//user represents the event organizer
public class User {

	 //private fields to protect sensitive data
	 private String name;
	 private String email;
	
	 //constructor to initialize user details
	 public User(String name, String email) {
	     this.name = name;
	     this.email = email;
	 }
	
	 //method to display organizer details
	 public void displayUser() {
	     System.out.println("Organizer Name: " + name);
	     System.out.println("Organizer Email: " + email);
	 }
}

