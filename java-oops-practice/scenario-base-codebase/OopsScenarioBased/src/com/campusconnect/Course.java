package com.campusconnect;
import java.util.ArrayList;
import java.util.List;

//class to represent a course
public class Course {
	//course attributes
	private String courseName;
    private Faculty faculty;
    private List<Student> students;

    //constructor to initialize course attributes
    Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        students = new ArrayList<>();
    }

    //method to add student in course
    public void addStudent(Student student) {
        students.add(student);
    }

    //method to remove student in course
    public void removeStudent(Student student) {
        students.remove(student);
    }

    //method to print details
    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Enrolled Students: " + students.size());
    }
	
}
