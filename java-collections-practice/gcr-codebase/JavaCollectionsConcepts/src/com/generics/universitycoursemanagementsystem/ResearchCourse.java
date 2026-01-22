package com.generics.universitycoursemanagementsystem;

public class ResearchCourse extends CourseType {

	// method for initializing research course
	public ResearchCourse(String courseName) {
		super(courseName);
	}

	// method for research based evaluation
	@Override
	public void evaluate() {
		System.out.println(courseName + " is evaluated using Research Work");
	}

}
