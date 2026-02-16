package com.employeemanagementsystem;

import java.util.Scanner;

public class EmployeeManagementDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService service = new EmployeeService();
		boolean running = true;

		while (running) {

			System.out.println("\n===== Employee Management =====");
			System.out.println("1. Add Employee");
			System.out.println("2. View All Employees");
			System.out.println("3. Update Salary");
			System.out.println("4. Delete Employee");
			System.out.println("5. Search Employee by Name");
			System.out.println("6. Exit");

			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> service.addEmployee();
			case 2 -> service.viewAllEmployees();
			case 3 -> service.updateSalary();
			case 4 -> service.deleteEmployee();
			case 5 -> service.searchEmployee();
			case 6 -> {
				running = false;
				System.out.println("Exiting...");
			}
			default -> System.out.println("Invalid choice!");
			}
		}

		sc.close();
	}
}
