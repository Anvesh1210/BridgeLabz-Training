package com.generics.universitycoursemanagementsystem;

public class AssignmentCourse extends CourseType {

	// method for initializing assignment course
	public AssignmentCourse(String courseName) {
		super(courseName);
	}

	// method for assignment based evaluation
	@Override
	public void evaluate() {
		System.out.println(courseName + " is evaluated using Assignments");
	}

}
