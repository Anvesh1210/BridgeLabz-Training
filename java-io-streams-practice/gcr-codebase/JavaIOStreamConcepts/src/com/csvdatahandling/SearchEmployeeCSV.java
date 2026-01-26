package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployeeCSV {
	public static void main(String[] args) {
		// CSV file path
		String filePath = "employees.csv";
		// Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee name to search: ");
		String searchName = sc.nextLine();
		boolean found = false;
		// BufferedReader reads file line by line
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			// Read and ignore header row
			br.readLine();
			// Read each record
			while ((line = br.readLine()) != null) {
				// Split CSV value
				String[] data = line.split(",");
				String id = data[0];
				String name = data[1];
				String department = data[2];
				String salary = data[3];
				if (name.equalsIgnoreCase(searchName)) {
					System.out.println("\nEmployee Found");
					System.out.println();
					System.out.println("ID: " + id);
					System.out.println("Name: " + name);
					System.out.println("Department: " + department);
					System.out.println("Salary: " + salary);
					found = true;
					break;
				}
			}
			// If employee not found
			if (!found) {
				System.out.println("\nEmployee not found!");
			}
		} catch (IOException e) {
			// Handle file errors
			System.out.println("Error reading CSV file: " + e.getMessage());
		}
		sc.close();
	}
}
