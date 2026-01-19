package com.skillforgeapplication;

import java.util.*;

//base course class
public class Course implements ICertifiable {
	protected String title;
	protected String instructor;
	protected List<String> modules;
	private double rating;
	private final List<String> reviews = new ArrayList<>();

	// constructor with default modules
	public Course(String title, String instructor) {
		this.title = title;
		this.instructor = instructor;
		this.modules = Arrays.asList("Introduction", "Core Concepts", "Final Assessment");
	}

	// constructor with custom modules
	public Course(String title, String instructor, List<String> modules) {
		this.title = title;
		this.instructor = instructor;
		this.modules = modules;
	}

	// method for protected rating update
	protected void updateRating(double newRating) {
		if (newRating >= 0 && newRating <= 5) {
			rating = (rating + newRating) / 2;
		}
	}

	// method for getting rating
	public double getRating() {
		return rating;
	}

	// method for adding internal review
	protected void addReview(String review) {
		reviews.add(review);
	}

	// method for getting read-only reviews
	public List<String> getReviews() {
		return Collections.unmodifiableList(reviews);
	}

	// method for generating default certificate
	public String generateCertificate() {
		return "Certificate of Completion for course: " + title;
	}
}
