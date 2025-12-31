package com.designprinciples.levelone;
import java.util.ArrayList;

//class to represent Student
public class Student {
	private String studentName;
    private ArrayList<Course> courses;

    //constructor to initialize student name
    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    // Association method
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    //method to View enrolled courses
    public void viewCourses() {
        System.out.println("\nCourses enrolled by " + studentName + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}
