package com.generics.universitycoursemanagementsystem;

public class Course<T extends CourseType> {

	// class attributes
	private T courseType;

	// method for initializing course
	public Course(T courseType) {
		this.courseType = courseType;
	}

	// method for displaying course details
	public void displayCourse() {
		System.out.println("Course Name: " + courseType.getCourseName());
		courseType.evaluate();
	}

	public T getCourseType() {
		return courseType;
	}
	
}
