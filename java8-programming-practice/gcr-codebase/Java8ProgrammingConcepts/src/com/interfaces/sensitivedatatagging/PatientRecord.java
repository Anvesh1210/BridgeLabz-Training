package com.interfaces.sensitivedatatagging;

//class contains sensitive information
public class PatientRecord implements SensitiveData {
	String patientName;

	public PatientRecord(String patientName) {
		this.patientName = patientName;
	}
}
