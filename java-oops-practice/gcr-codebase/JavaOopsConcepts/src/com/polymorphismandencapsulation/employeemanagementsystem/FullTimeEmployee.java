package com.polymorphismandencapsulation.employeemanagementsystem;

//class to represent a Full Time Employee
public class FullTimeEmployee extends Employee{
	private double fixedSalary;
	
	//Parameterized Constructor
	public FullTimeEmployee(int employeeId, String name, double baseSalary) {
		super(employeeId, name, baseSalary);
		this.fixedSalary = baseSalary;
	}

	//overridden method to calculate salary
	@Override
	public double calculateSalary() {
		return fixedSalary;
	}
	
	
	
}
