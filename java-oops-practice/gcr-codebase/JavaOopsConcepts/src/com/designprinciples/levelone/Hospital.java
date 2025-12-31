package com.designprinciples.levelone;

import java.util.ArrayList;
import java.util.List;

//class to represent a hospital
public class Hospital {
	private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    //parameterized constructor to initialized Hospital name
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    //methods to register people in the hospital system
    public void registerDoctor(Doctor d) {
        doctors.add(d);
    }

    public void admitPatient(Patient p) {
        patients.add(p);
    }
    
    public String getName() {
        return name;
    }
}
