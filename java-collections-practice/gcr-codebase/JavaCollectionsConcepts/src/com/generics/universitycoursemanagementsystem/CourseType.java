package com.generics.universitycoursemanagementsystem;

public abstract class CourseType {
	// class attributes
	protected String courseName;

	// method for initializing course name
	public CourseType(String courseName) {
		this.courseName = courseName;
	}

	// method for getting course name
	public String getCourseName() {
		return courseName;
	}

	// method for displaying evaluation type
	public abstract void evaluate();
}
