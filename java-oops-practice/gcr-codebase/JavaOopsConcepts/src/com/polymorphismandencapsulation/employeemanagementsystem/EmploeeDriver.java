package com.polymorphismandencapsulation.employeemanagementsystem;

//class to use Employee class
public class EmploeeDriver {
	public static void main(String[] args) {
		
		//Creating Employee
		Employee employee1 = new FullTimeEmployee(101, "Ashish", 25000);
		Employee employee2 = new PartTimeEmployee(201, "Ayush", 80, 250);
		Employee employee3 = new FullTimeEmployee(102, "Akash", 55000);
		
		
		//displaying details
		System.out.println(employee1.getName()+" salary is : "+employee1.calculateSalary() );
		
		System.out.println();
		employee1.displayDetails();
		System.out.println();
		employee2.displayDetails();
		System.out.println();
		employee3.displayDetails();
	}
}
