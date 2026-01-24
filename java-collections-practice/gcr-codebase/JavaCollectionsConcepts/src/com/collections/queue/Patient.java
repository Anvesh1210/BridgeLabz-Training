package com.collections.queue;

//class to represent a Patient
public class Patient implements Comparable<Patient> {
	
	//patient attributes
	private String name;
	private int severityLevel;

	//constructor to initialize patient
	public Patient(String name, int severityLevel) {
		this.name = name;
		this.severityLevel = severityLevel;
	}

	//getter/ setter for patient attributes
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeverityLevel() {
		return severityLevel;
	}

	public void setSeverityLevel(int severityLevel) {
		this.severityLevel = severityLevel;
	}

	//override compareTo method to compare two patient based on severity level
	@Override
	public int compareTo(Patient o) {
		return o.severityLevel-this.severityLevel;
	}
	
	
}
