package com.inheritance.leveltwo;

//Student class extending Person
public class Student extends Person {
    private String grade;

    // Constructor to initialize student details
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Displays student role and grade
    @Override
    public void displayRole() {
        System.out.println("Role  : Student");
        System.out.println("Grade : " + grade);
    }
}