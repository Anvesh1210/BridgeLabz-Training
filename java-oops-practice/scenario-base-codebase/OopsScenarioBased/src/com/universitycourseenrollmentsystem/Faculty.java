package com.universitycourseenrollmentsystem;

//class to represent a Faculty
public class Faculty {
	//faculty attributes
    private String facultyName;

    //constructor to initialize faculty name
    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }
    
    //method to assign grade to student
    public void assignGrade(Enrollment enrollment, String grade) {
        enrollment.assignGrade(grade);
        System.out.println("\n--------------------------------------");
        System.out.println("Grade Assigned By: " + facultyName);
        System.out.println("--------------------------------------");
    }
}
