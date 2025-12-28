package com.constructor.levelone;

//subclass PostgraduateStudent to demonstrate the use of protected members.
public class PostgraduateStudent extends Student {
    private String specialization;
    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    //accessing protected member 'name'
    public void displayPGStudent() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA());
    }
}

