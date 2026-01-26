package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateEmployeeSalaryCSV {

	public static void main(String[] args) {
		// Input and output CSV file paths
		String inputFile = "employees.csv";
		String outputFile = "updated_employees.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
				FileWriter writer = new FileWriter(outputFile)) {
			String line;
			// Read header row and write it to new file
			String header = br.readLine();
			writer.append(header).append("\n");
			// Read each employee record
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String id = data[0];
				String name = data[1];
				String department = data[2];
				double salary = Double.parseDouble(data[3]);
				if (department.equalsIgnoreCase("IT")) {
					salary = salary + (salary * 0.10);
				}
				writer.append(id).append(",").append(name).append(",").append(department).append(",")
						.append(String.valueOf((int) salary)).append("\n");
			}
			// Ensure all data is written
			writer.flush();
			System.out.println("Salary updated successfully!");
			System.out.println("New file created: updated_employees.csv");
		} catch (IOException e) {
			// Handle file related errors
			System.out.println("Error processing CSV file: " + e.getMessage());
		}
	}
}
