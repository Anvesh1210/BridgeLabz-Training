package com.designprinciples.levelone;

import java.util.ArrayList;
import java.util.List;

public class Patient {
	private String name;
    private String condition;
    private List<Doctor> doctors; // Association: Patient knows their doctors

    public Patient(String name, String condition) {
        this.name = name;
        this.condition = condition;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }
}
