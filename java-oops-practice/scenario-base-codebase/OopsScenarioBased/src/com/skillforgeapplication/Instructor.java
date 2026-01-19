package com.skillforgeapplication;

public class Instructor extends User {
	// constructor
	public Instructor(String name) {
		super(name);
	}

	// method for uploading course
	public Course uploadCourse(String title) {
		return new Course(title, name);
	}
}
