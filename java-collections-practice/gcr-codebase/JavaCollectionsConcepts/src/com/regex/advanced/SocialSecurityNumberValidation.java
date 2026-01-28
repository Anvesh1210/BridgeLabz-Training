package com.regex.advanced;

//program for SSN vaidation
public class SocialSecurityNumberValidation {
	public static void main(String[] args) {
		String ssn = "123-45-6789";
		String regex = "^\\d{3}-\\d{2}-\\d{4}$";
		System.out.println(ssn.matches(regex) ? "Valid SSN" : "Invalid SSN");
	}
}
