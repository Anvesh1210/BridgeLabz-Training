package com.constructor.levelone;

//class to store student details
public class Student {
	//Data members with different access modifiers
    public int rollNumber;
    protected String name;
    private double cgpa;

    //creating parameterized constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        setCGPA(cgpa);
    }

    //public getter for CGPA
    public double getCGPA() {
        return cgpa;
    }

    //public setter for CGPA
    public void setCGPA(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Setting to 0.0");
            this.cgpa = 0.0;
        }
    }

    //method to display basic details
    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}
