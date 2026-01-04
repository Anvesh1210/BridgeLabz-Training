package com.polymorphismandencapsulation.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalApplication {
    public static void main(String[] args) {

    		//creating Scanner object
        Scanner sc = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();

        System.out.print("How many patients do you want to add? ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {

            System.out.println("\nSelect Patient Type:");
            System.out.println("1. In-Patient");
            System.out.println("2. Out-Patient");
            int choice = sc.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("Wrong input! Please choose 1 or 2.");
                i--;
                continue;
            }

            System.out.print("Enter Patient ID: ");
            String id = sc.next();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            Patient patient;

            if (choice == 1) {
                System.out.print("Enter Days Admitted: ");
                int days = sc.nextInt();

                System.out.print("Enter Daily Charge: ");
                double charge = sc.nextDouble();

                patient = new InPatient(id, name, age, days, charge);
            } else {
                System.out.print("Enter Consultation Fee: ");
                double fee = sc.nextDouble();

                patient = new OutPatient(id, name, age, fee);
            }

            System.out.print("Enter Medical Record / Diagnosis: ");
            String record = sc.next();

            ((MedicalRecord) patient).addRecord(record);

            patients.add(patient);
        }

        System.out.println("\n----- Patient Billing Details -----");

        //printing patient information
        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Total Bill : " + p.calculateBill());

            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }

            System.out.println("----------------------------------");
        }

        //closing Scanner object
        sc.close();
    }
}

