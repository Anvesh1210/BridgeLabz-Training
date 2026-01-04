package com.polymorphismandencapsulation.employeemanagementsystem;

//Abstract class to represent Employee
public abstract class Employee {
	
	//Employee attributes
	private int employeeId;
	private String name;
	private double baseSalary;
	
	//Parameterized constructor
	public Employee(int employeeId, String name, double baseSalary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	//getter and setter methods for attributes 
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	//abstract method calculateSalary() which is inherited in sub classes
	public abstract double calculateSalary();
	
	//method to display details of employees
	public void displayDetails() {
		System.out.println("Employee ID: "+ employeeId);
		System.out.println("Name: "+name);
		System.out.println("Base Salary: "+baseSalary);
	}
	
}
