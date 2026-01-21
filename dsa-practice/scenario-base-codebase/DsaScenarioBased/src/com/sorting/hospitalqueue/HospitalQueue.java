package com.sorting.hospitalqueue;

import java.util.ArrayList;
import java.util.List;

//class to represent Hospital Queue
public class HospitalQueue {
	// list of patients
	private List<Patient> patientList;

	// constructor to initialize patient list
	public HospitalQueue() {
		patientList = new ArrayList<>();
	}

	// method to add a patient in the Hospital queue
	public void add(Patient patient) {
		patientList.add(patient);
	}

	private void bubbleSort() {
		int n = patientList.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (patientList.get(j).getCriticality() < patientList.get(j + 1).getCriticality()) {
					Patient temp = patientList.get(j);
					patientList.add(j, patientList.get(j + 1));
					patientList.add(j + 1, temp);
				}
			}
		}
	}

	public void assignBed() {
		bubbleSort();
		System.out.println("Bed Assignment Order (High Critical First):");

		int bedNo = 1;
		for (Patient p : patientList) {
			System.out.println("Bed " + bedNo + " → " + p.getName() + " (Criticality: " + p.getCriticality() + ")");
			bedNo++;
		}
	}
}
