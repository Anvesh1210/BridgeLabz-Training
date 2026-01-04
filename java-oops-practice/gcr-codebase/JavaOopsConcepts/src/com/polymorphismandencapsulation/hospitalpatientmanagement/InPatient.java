package com.polymorphismandencapsulation.hospitalpatientmanagement;

//class to represent In Patient
public class InPatient extends Patient implements MedicalRecord {

	private int daysAdmitted;
	private double dailyCharge;
	private String record;

	public InPatient(String id, String name, int age, int days, double charge) {
		super(id, name, age);
		this.daysAdmitted = days;
		this.dailyCharge = charge;
	}

	//bill = days * daily charge + fixed service charge
	@Override
	public double calculateBill() {
		return (daysAdmitted * dailyCharge) + 2000;
	}

	@Override
	public void addRecord(String record) {
		this.record = record;
		setMedicalHistory(record);
	}

	@Override
	public void viewRecords() {
		System.out.println("Medical Record: " + record);
}
}

