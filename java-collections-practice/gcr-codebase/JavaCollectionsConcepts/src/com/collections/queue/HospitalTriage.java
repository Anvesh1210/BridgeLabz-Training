package com.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

//class to use Hospital Triage
public class HospitalTriage{
	public static void main(String[] args) {
		//patient queue
		Queue<Patient> patients = new PriorityQueue<Patient>();
		patients.add(new Patient("John", 3));
		patients.add(new Patient("Alice", 5));
		patients.add(new Patient("Bob", 2));
		
		//printing patient
		for(Patient patient :patients) {
			System.out.println(patient.getName());
		}
	}
}
