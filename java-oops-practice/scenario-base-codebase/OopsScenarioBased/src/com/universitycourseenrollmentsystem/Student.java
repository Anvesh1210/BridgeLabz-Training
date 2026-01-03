package com.universitycourseenrollmentsystem;

//class to represent a student
public class Student {
	
	//Student attributes
    protected int studentId;
    protected String name;
    private double gpa;

    //constructor to initialize id and name of student
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    //setter method to set GPA of student
    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //getter method to get Transcript of student
    public double getTranscript() {
        return gpa;
    }

    //method to display details of student
    public void displayStudent() {
        System.out.printf("%-15s : %d%n", "Student ID", studentId);
        System.out.printf("%-15s : %s%n", "Student Name", name);
    }
}
