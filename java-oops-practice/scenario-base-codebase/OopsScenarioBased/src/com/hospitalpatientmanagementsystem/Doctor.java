package com.hospitalpatientmanagementsystem;

//class to represent a doctor
public class Doctor {
	
	//Doctor attributes
    private int doctorId;
    private String name;
    private String specialization;

    //constructor to initialize doctor attributes
    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    //method to display doctor details
    public void displayInfo() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}
