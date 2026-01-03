package com.universitycourseenrollmentsystem;

//Enrollment class to save enrollment info
public class Enrollment implements Graded {
	
	//enrollment attributes
    private Student student;
    private Course course;
    private String grade;

    //constructor to initialize course attributes
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    //overridden method to assign grade to student
    @Override
    public void assignGrade(String grade) {
        this.grade = grade;
        calculateGpa();
    }

    //method to calculate GPA of student
    private void calculateGpa() {
        double points;
        
        if (grade.equals("A+")) points = 10;
        else if (grade.equals("A")) points = 9.5;
        else if (grade.equals("B")) points = 8;
        else if (grade.equals("C")) points = 6;
        else points = 4;

        double gpa = (points * course.getCredits()) / course.getCredits();
        student.setGpa(gpa);
    }

    //method to display Details
    public void displayEnrollment() {
        System.out.println("\n======================================");
        System.out.println("        UNIVERSITY TRANSCRIPT");
        System.out.println("======================================");

        student.displayStudent();
        System.out.printf("%-15s : %s%n", "Course Code", course.getCourseCode());
        System.out.printf("%-15s : %s%n", "Course Name", course.getCourseName());
        System.out.printf("%-15s : %s%n", "Grade", grade);
        System.out.printf("%-15s : %.2f%n", "GPA", student.getTranscript());

        System.out.println("======================================");
    }
}