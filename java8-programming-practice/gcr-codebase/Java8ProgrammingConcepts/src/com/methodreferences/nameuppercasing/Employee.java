package com.methodreferences.nameuppercasing;

//class representing a Employee
public class Employee {
	//Employee Attributes
	private String name;
	private int id;
	
	//constructor to initialize Employee
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	//getter and setter method for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//print method for printing employee
	public void print() {
		System.out.println("Employee name: "+name+", Employee Id: "+id);
	}
}
