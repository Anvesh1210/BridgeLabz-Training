package com.employeemanagementsystem;

import java.util.List;
import java.util.Scanner;

public class EmployeeService {

	private EmployeeDAO dao = new EmployeeDAO();
	private Scanner sc = new Scanner(System.in);

	// Add Employee
	public void addEmployee() {

		System.out.print("Enter ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Department: ");
		String dept = sc.nextLine();

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();

		Employee emp = new Employee(id, name, dept, salary);

		if (dao.addEmployee(emp))
			System.out.println("Employee Added Successfully!");
		else
			System.out.println("Failed! (Duplicate ID maybe)");
	}

	// View All Employees
	public void viewAllEmployees() {

		List<Employee> list = dao.getAllEmployees();

		if (list.isEmpty()) {
			System.out.println("No Employees Found.");
		} else {
			list.forEach(System.out::println);
		}
	}

	// Update Salary
	public void updateSalary() {

		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();

		System.out.print("Enter New Salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();

		if (dao.updateSalary(id, salary))
			System.out.println("Salary Updated Successfully!");
		else
			System.out.println("Employee Not Found!");
	}

	// Delete Employee
	public void deleteEmployee() {

		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		if (dao.deleteEmployee(id))
			System.out.println("Employee Deleted Successfully!");
		else
			System.out.println("Employee Not Found!");
	}

	// Search Employee by Name
	public void searchEmployee() {

		System.out.print("Enter Name to Search: ");
		String name = sc.nextLine();

		List<Employee> list = dao.searchByName(name);

		if (list.isEmpty()) {
			System.out.println("No Employee Found.");
		} else {
			list.forEach(System.out::println);
		}
	}
}
