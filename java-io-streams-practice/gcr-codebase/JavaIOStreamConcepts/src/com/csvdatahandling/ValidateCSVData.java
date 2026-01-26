package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {
	// Regex pattern for email validation
	private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	// Regex pattern for 10 digit phone number
	private static final String PHONE_REGEX = "^[0-9]{10}$";

	public static void main(String[] args) {
		// CSV file path
		String filePath = "users.csv";
		// Compile regex patterns
		Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
		Pattern phonePattern = Pattern.compile(PHONE_REGEX);
		// Read CSV file
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			// Skip header row
			br.readLine();
			System.out.println("Invalid Records:");
			System.out.println("----------------------------------");
			// Read each row
			while ((line = br.readLine()) != null) {
				// Split CSV values
				String[] data = line.split(",");
				String id = data[0];
				String name = data[1];
				String email = data[2];
				String phone = data[3];
				boolean valid = true;
				// Validate email
				if (!emailPattern.matcher(email).matches()) {
					System.out.println("Invalid Email → ID: " + id + ", Email: " + email);
					valid = false;
				}
				// Validate phone number
				if (!phonePattern.matcher(phone).matches()) {
					System.out.println("Invalid Phone → ID: " + id + ", Phone: " + phone);
					valid = false;
				}
				// Print separator if record is invalid
				if (!valid) {
					System.out.println();
				}
			}
		} catch (IOException e) {
			// Handle file errors
			System.out.println("Error reading CSV file: " + e.getMessage());
		}
	}
}
