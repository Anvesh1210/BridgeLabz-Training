package com.inheritance.levelone;
	
//class to represent employee
public class Employee {
	  String name;
	    int id;
	    double salary;

	    //parameterized constructor
	    Employee(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	    //method to display details
	    void displayDetails() {
	        System.out.println("Name   : " + name);
	        System.out.println("ID     : " + id);
	        System.out.println("Salary : " + salary);
	    }
	
}
