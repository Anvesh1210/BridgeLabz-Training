package com.constructor.levelone;

public class Course {
	
	//course class attributes
    private String courseName;
    private int duration; // in months
    private double fee;

    //Class variable
    private static String instituteName = "ABC Institute";

    //Parameterized Constructor for Course class
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    //method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    //method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
