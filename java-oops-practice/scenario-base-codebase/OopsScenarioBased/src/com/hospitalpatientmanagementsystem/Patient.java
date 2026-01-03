package com.hospitalpatientmanagementsystem;

//Abstract class to represent a patient
public abstract class Patient {
	
	//patient attributes
    private int patientId;
    private String name;
    private int age;
    private String medicalHistory; // sensitive data

    // Normal admission constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = "Not Provided";
    }

    // Emergency admission constructor (Overloaded)
    public Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    //method to get Summary of the patient
    public String getSummary() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    //abstract method displayInfo() (used to subclasses)
    public abstract void displayInfo();
}

