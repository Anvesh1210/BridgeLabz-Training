package com.designprinciples.levelone;
import java.util.ArrayList;
import java.util.List;

//class to represent Student
public class Student2 {
	private String name;
    private int studentId;
    private List<Course2> enrolledCourses;

    //parameterized constructor
    public Student2(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return studentId;
    }

    //Student interacts with Course to enroll
    public void enrollInCourse(Course2 course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this);
            System.out.println("Success: " + this.name + " enrolled in " + course.getTitle());
        } else {
            System.out.println("Info: " + this.name + " is already in " + course.getTitle());
        }
    }
    
    public void showTranscript() {
        System.out.println("\nTranscript for " + name );
        for (Course2 c : enrolledCourses) {
            System.out.println("- " + c.getTitle() + " (Prof. " + 
                (c.getProfessor() != null ? c.getProfessor().getName() : "TBA") + ")");
        }
    }
}
