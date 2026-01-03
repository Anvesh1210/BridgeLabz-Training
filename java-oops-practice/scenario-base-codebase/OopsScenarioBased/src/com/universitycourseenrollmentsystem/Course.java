package com.universitycourseenrollmentsystem;

//class to represent a Course
public class Course {
	
	//course attributes
    private String courseCode;
    private String courseName;
    private int credits;

    //course constructor to initialize attributes
    public Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    //getter methods to get data
    public int getCredits() {
        return credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
}

