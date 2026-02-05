package com.interfaces.sensitivedatatagging;

public class SensitiveDriver {
	public static void main(String[] args) {
		PatientRecord record = new PatientRecord("John");
		if (record instanceof SensitiveData) {
			System.out.println("Encrypting sensitive data...");
		} else {
			System.out.println("No encryption needed");
		}
	}
}
