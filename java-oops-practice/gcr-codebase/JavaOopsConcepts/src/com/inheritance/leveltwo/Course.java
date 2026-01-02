package com.inheritance.leveltwo;

//class to represent course
public class Course {

    //course Attributes
    protected String courseName;
    protected int duration; // in hours

    //parameterized constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    //method to display details
    public void displayDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " hours");
    }
}
