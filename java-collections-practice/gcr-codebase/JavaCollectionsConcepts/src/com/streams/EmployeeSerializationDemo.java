package com.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerializationDemo {

	public static void main(String[] args) {
		String fileName = "employees.dat";
		// creating list of employees
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Anvesh", "IT", 50000));
		employees.add(new Employee(102, "Rahul", "HR", 40000));
		employees.add(new Employee(103, "Priya", "Finance", 45000));

		//Serialization
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
			oos.writeObject(employees);
			oos.close();
			System.out.println("Employee data saved successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		//Deserialization
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
			List<Employee> savedEmployees = (List<Employee>) ois.readObject();
			ois.close();
			System.out.println("\nEmployee Details:");
			for (Employee emp : savedEmployees) {
				emp.display();
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
