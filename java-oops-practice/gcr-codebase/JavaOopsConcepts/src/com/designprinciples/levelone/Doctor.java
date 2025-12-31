package com.designprinciples.levelone;

import java.util.ArrayList;
import java.util.List;

//class to represent Doctor 
public class Doctor {
	private String name;
    private String specialization;
    private List<Patient> patients;

    //Parameterized constructor 
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    //getter method to get name
    public String getName() {
        return name;
    }

    //method to Link Patient and Doctor
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
    }

    //method to consult patient to doctor
    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("--------------------------------------------------");
            System.out.println("CONSULTATION REPORT");
            System.out.println("Doctor: Dr. " + this.name + " (" + this.specialization + ")");
            System.out.println("Patient: " + patient.getName());
            System.out.println("Status: Dr. " + this.name + " is treating " + patient.getName() + " for " + patient.getCondition());
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("Error: Dr. " + this.name + " is not assigned to patient " + patient.getName());
        }
    }
}
