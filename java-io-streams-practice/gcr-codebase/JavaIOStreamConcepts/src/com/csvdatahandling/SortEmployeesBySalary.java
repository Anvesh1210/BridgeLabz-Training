package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalary {

	// Employee class to store CSV data
	static class Employee {
		String id;
		String name;
		String department;
		int salary;

		Employee(String id, String name, String department, int salary) {
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
		}
	}

	public static void main(String[] args) {
		String filePath = "employees.csv";
		// List to store employee objects
		List<Employee> employeeList = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				employeeList.add(new Employee(data[0], data[1], data[2], Integer.parseInt(data[3])));
			}
		} catch (IOException e) {
			System.out.println("Error reading CSV file: " + e.getMessage());
		}
		// Sort employees by salary in descending order
		Collections.sort(employeeList, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e2.salary - e1.salary; // Descending order
			}
		});
		// Print top 5 highest-paid employees
		System.out.println("Top 5 Highest-Paid Employees");
		System.out.println();
		int limit = Math.min(5, employeeList.size());
		for (int i = 0; i < limit; i++) {
			Employee e = employeeList.get(i);
			System.out.println("ID: " + e.id);
			System.out.println("Name: " + e.name);
			System.out.println("Department: " + e.department);
			System.out.println("Salary: " + e.salary);
			System.out.println();
		}
	}
}
