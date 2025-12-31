package com.designprinciples.levelone;
import java.util.ArrayList;

//class to represent course
public class Course {
	private String courseName;
    private ArrayList<Student> enrolledStudents;

    //parameterized constructor to initialize course name
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Show students enrolled in this course
    public void showEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.getStudentName());
        }
    }
}
