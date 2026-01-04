package com.polymorphismandencapsulation.hospitalpatientmanagement;

//interface defining medical record operations
public interface MedicalRecord {
	//add diagnosis/treatment details
	void addRecord(String record);
	//view stored medical records
	void viewRecords();
}
