package com.streamapi.hospitaldoctoravailability;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HospitalDoctorAvailability {
	public static void main(String[] args) {
		List<Doctor> doctors = Arrays.asList(new Doctor("Dr. Sharma", "Cardiology", true),
				new Doctor("Dr. Khan", "Neurology", false), new Doctor("Dr. Mehta", "Orthopedics", true),
				new Doctor("Dr. Rao", "Dermatology", true));

		// Doctors available on weekends and sorted by specialty
		doctors.stream().filter(Doctor::isAvailableOnWeekend).sorted(Comparator.comparing(Doctor::getSpecialty))
				.forEach(d -> System.out.println(d));
	}
}
