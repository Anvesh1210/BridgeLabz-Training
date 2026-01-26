package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
	public static void main(String[] args) {
		// CSV file path
		String filePath = "students.csv";
		int count = 0;
		// BufferedReader reads file line by line
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			br.readLine();
			while ((line = br.readLine()) != null) {
				count++;
			}
			System.out.println("Total number of records (excluding header): " + count);
		} catch (IOException e) {
			// Handle file reading errors
			System.out.println("Error reading CSV file: " + e.getMessage());
		}
	}
}
