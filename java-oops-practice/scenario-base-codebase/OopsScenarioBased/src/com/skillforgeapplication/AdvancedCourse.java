package com.skillforgeapplication;

public class AdvancedCourse extends Course {

	// constructor
	public AdvancedCourse(String title, String instructor) {
		super(title, instructor);
	}

	// method for generating advanced certificate
	public String generateCertificate() {
		return "Advanced Level Certificate awarded for: " + title;
	}
}
