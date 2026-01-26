package com.csvdatahandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {
	public static void main(String[] args) {
		// CSV file path
		String filePath = "employees.csv";
		// FileWriter is used to write data into a file
		try (FileWriter writer = new FileWriter(filePath)) {
			writer.append("ID,Name,Department,Salary\n");
			writer.append("101,Anvesh,IT,60000\n");
			writer.append("102,Rahul,HR,45000\n");
			writer.append("103,Priya,Finance,55000\n");
			writer.append("104,Amit,IT,70000\n");
			writer.append("105,Neha,Marketing,48000\n");
			writer.flush();
			System.out.println("Employee data written successfully to employees.csv");
		} catch (IOException e) {
			// Handle file writing errors
			System.out.println("Error writing CSV file: " + e.getMessage());
		}
	}
}
