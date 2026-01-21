package com.sorting.hospitalqueue;

//class to represent a patient
public class Patient {
	private String name;
	private int criticality;

	// constructor to initialize patient
	public Patient(String name, int criticality) {
		this.name = name;
		this.criticality = criticality;
	}

	// getter and setter methods for patient
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCriticality() {
		return criticality;
	}

	public void setCriticality(int criticality) {
		this.criticality = criticality;
	}

}
