package com.methodreferences.hospitalpatientidprinting;

//class representing a patient
public class Patient {
	//Patient attributes
	private String name;
	private int id;
	
	//constructor to initialize patient
	public Patient(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	//print method to print patient details
	public void print() {
		System.out.println("Name: "+name+", Id: "+id);
	}
}
