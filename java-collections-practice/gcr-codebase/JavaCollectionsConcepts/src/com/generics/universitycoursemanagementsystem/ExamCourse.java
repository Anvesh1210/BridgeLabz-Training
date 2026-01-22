package com.generics.universitycoursemanagementsystem;

public class ExamCourse extends CourseType {

	// method for initializing exam course
	public ExamCourse(String courseName) {
		super(courseName);
	}

	// method for exam based evaluation
	@Override
	public void evaluate() {
		System.out.println(courseName + " is evaluated using Exams");
	}
}
