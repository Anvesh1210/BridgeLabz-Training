package com.edumentorappliaction;

//class represent a Learner
public class Learner extends User{
	private String courseType;

	//constructor initialize Learner fields
	public Learner(String name, String email, int userId, String courseType) {
		super(name, email, userId);
		this.courseType = courseType;
	}

	//getter method for course type
	public String getCourseType() {
		return courseType;
	}

	@Override
	public void displayDetails() {
		System.out.println("\n-----Student Details-----");
		super.displayDetails();
		System.out.println("Course Type: "+courseType);
	}
	
	
	
	
}
