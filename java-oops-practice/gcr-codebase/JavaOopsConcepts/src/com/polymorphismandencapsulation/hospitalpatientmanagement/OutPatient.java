package com.polymorphismandencapsulation.hospitalpatientmanagement;

//class to represent Out Patient
public class OutPatient extends Patient implements MedicalRecord {

	private double consultationFee;
	private String record;

	public OutPatient(String id, String name, int age, double fee) {
		super(id, name, age);
		this.consultationFee = fee;
	}

	//bill = consultation fee
	@Override
	public double calculateBill() {
		return consultationFee;
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
