package com.methodreferences.hospitalpatientidprinting;

import java.util.Arrays;
import java.util.List;

//printPatinet class for printing patients
public class PrintPatient {
	public static void main(String[] args) {
		List<Patient> patients = Arrays.asList(new Patient("Anvesh", 1), new Patient("Ananya", 2),
				new Patient("Abuzar", 3), new Patient("Arif", 4), new Patient("Harshit", 5), new Patient("Washim", 6));
		patients.forEach(Patient::print);
	}
}
