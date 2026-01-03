package com.hospitalpatientmanagementsystem;

public class HospitalManagement {
	public static void main(String[] args) {
		
		//creating Doctor objects
        Doctor doctor = new Doctor(101, "Dr. Sharma", "Cardiology");
        //displaying doctor details
        doctor.displayInfo();
        System.out.println();

        //creating InPatient object
        Patient p1 = new InPatient(1, "Rahul", 45,
                "Heart Problem", 302, 5);

        //creating OutPatient object
        Patient p2 = new OutPatient(2, "Anita", 30,
                "10-Jan-2026", 500);

        //displaying patient details
        p1.displayInfo();
        System.out.println();
        p2.displayInfo();
        System.out.println();

        //creating bill object and printing total bill
        Bill bill = new Bill(10000, 0.18, 0.10);
        System.out.println("Total Bill Amount: " + bill.calculatePayment());
    }
}
