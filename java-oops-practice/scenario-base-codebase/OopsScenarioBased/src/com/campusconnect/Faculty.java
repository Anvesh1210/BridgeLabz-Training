package com.campusconnect;

//class to represent a faculty
public class Faculty extends Person{
	//faculty attributes
	 private String department;

	 //constructor to initialize faculty attributes
	 Faculty(String name, String email, int id, String department) {
	     super(name, email, id);
	     this.department = department;
	 }

	 //method to print details
	 @Override
	 public void printDetails() {
	     System.out.println("Faculty Name: " + name);
	     System.out.println("Email: " + email);
	     System.out.println("ID: " + id);
	     System.out.println("Department: " + department);
	 }
}
