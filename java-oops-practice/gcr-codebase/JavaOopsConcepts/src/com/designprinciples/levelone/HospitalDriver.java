package com.designprinciples.levelone;

//class to use Hospital
public class HospitalDriver {
	public static void main(String[] args) {
        //creating a Hospital
        Hospital myHospital = new Hospital("City General");

        //creating doctor objects
        Doctor doc1 = new Doctor("Strange", "Neurology");
        Doctor doc2 = new Doctor("House", "Diagnostics");
        
        //creating Patient objects
        Patient pat1 = new Patient("Tony", "Shrapnel Injury");
        Patient pat2 = new Patient("Steve", "Hypothermia");

        //Register them in the Hospital system
        myHospital.registerDoctor(doc1);
        myHospital.registerDoctor(doc2);
        myHospital.admitPatient(pat1);
        myHospital.admitPatient(pat2);

        //Create Associations (Assign Patients to Doctors)
        doc1.addPatient(pat1);
        doc2.addPatient(pat1);
        doc2.addPatient(pat2);

        //Demonstrate Communication (Consultations)
        System.out.println("--- Hospital System: " + myHospital.getName() + " ---\n");
        
        doc1.consult(pat1);
        doc2.consult(pat1);
        
        
        doc1.consult(pat2);
    }
}
