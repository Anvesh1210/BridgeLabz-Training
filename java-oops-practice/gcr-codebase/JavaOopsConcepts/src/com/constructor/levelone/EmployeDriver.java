package com.constructor.levelone;

public class EmployeDriver {
	public static void main(String[] args) {

        //create an Employee object
        Employee e1 = new Employee(101, "IT", 50000);

        //display Employee details
        System.out.println("Employee Details:");
        e1.displayEmployee();

        System.out.println();

        //create a Manager object
        Manager m1 = new Manager(201, "HR", 80000, "Senior");

        //display Manager details
        System.out.println("Manager Details:");
        m1.displayManager();

        //modify salary using public method
        m1.setSalary(90000);

        //display details after salary update
        System.out.println("\nAfter salary update:");
        m1.displayManager();
    }
}
