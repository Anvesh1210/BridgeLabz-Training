package com.inheritance.leveltwo;
//Superclass representing a common person in the restaurant
public class Persen2 {

	// Common attributes
	protected String name;
	protected int id;

	// Constructor to initialize person details
	public Persen2(String name, int id) {
	    this.name = name;
	    this.id = id;
	}

	// Displays basic person information
	public void displayDetails() {
	    System.out.println("Name : " + name);
	    System.out.println("ID   : " + id);
	}
}
