package com.inheritance.leveltwo;

//Teacher class extending Person
public class Teacher extends Person {
    private String subject;

    // Constructor to initialize teacher details
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Displays teacher role and subject
    @Override
    public void displayRole() {
        System.out.println("Role    : Teacher");
        System.out.println("Subject : " + subject);
    }
}
