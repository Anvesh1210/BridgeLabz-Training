package com.polymorphismandencapsulation.hospitalpatientmanagement;

//abstract base class for all patients
public abstract class Patient {

	//patient attributes
	protected String patientId;
	protected String name;
	protected int age;

	private String diagnosis;
	private String medicalHistory;

	//constructor
	public Patient(String patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	//concrete method common to all patients
	public void getPatientDetails() {
		System.out.println("Patient ID : " + patientId);
		System.out.println("Name       : " + name);
		System.out.println("Age        : " + age);
	}

	//encapsulated setters for sensitive data
	protected void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	protected void setMedicalHistory(String history) {
		this.medicalHistory = history;
	}

	protected String getDiagnosis() {
		return diagnosis;
	}

	protected String getMedicalHistory() {
		return medicalHistory;
	}

	//abstract method for billing (polymorphism)
	public abstract double calculateBill();
}
