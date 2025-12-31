package com.designprinciples.levelone;

import java.util.ArrayList;
import java.util.List;

//class represent course
public class Course2 {
	private String courseCode;
    private String title;
    private Professor professor;
    private List<Student2> roster;

    //parameterized constructor
    public Course2(String courseCode, String title) {
        this.courseCode = courseCode;
        this.title = title;
        this.roster = new ArrayList<>();
    }

    //getter methods
    public String getTitle() {
        return title;
    }

    public String getCode() {
        return courseCode;
    }

    public Professor getProfessor() {
        return professor;
    }

    //setter called by Professor class to establish link
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    //method called by Student class to update roster
    public void addStudent(Student2 s) {
        if (!roster.contains(s)) {
            roster.add(s);
        }
    }

    public void showRoster() {
        System.out.println("\nRoster for " + title + " (" + courseCode + ")");
        System.out.println("Instructor: " + (professor != null ? professor.getName() : "Vacant"));
        System.out.println("Enrolled Students: " + roster.size());
        for (Student2 s : roster) {
            System.out.println(s.getId() + ": " + s.getName());
        }
    }
}
