package com.designprinciples.levelone;
import java.util.ArrayList;

//class to represent School
public class School {
	private String schoolName;
    private ArrayList<Student> students;

    //constructor to initialize School
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Aggregation
    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("\nStudents in " + schoolName + ":");
        for (Student student : students) {
            System.out.println(student.getStudentName());
        }
    }
}
