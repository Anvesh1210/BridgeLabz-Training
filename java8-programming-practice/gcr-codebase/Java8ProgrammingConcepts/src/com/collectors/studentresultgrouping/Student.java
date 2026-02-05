package com.collectors.studentresultgrouping;

//class representing a Student
public class Student {
	//Student Attributes
	private String name;
	private String grade;

	//constructor to initialize Student
	public Student(String name, String grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	//overridden toString() method 
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}

	//getter method for Student
	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

}
