package com.streams;

import java.io.Serializable;

//class to represent a employee
public class Employee implements Serializable {
	private int id;
	private String name;
	private String department;
	private double salary;

	// constructor
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// method to disply employee
	public void display() {
		System.out.println(id + " , " + name + " , " + department + " , " + salary);
	}
}
