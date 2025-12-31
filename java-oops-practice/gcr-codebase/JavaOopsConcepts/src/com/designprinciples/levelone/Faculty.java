package com.designprinciples.levelone;

//class to represent Faculty
public class Faculty {
	private String facultyName;

	//Constructor to initialize faculty name
    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    //getter method for faculty name
    public String getFacultyName() {
        return facultyName;
    }
}
