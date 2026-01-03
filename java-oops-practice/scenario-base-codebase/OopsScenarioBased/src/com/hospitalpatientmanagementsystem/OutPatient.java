package com.hospitalpatientmanagementsystem;

//class to represent Out Patient
public class OutPatient extends Patient {
	
	//Out Patient attributes
    private String visitDate;
    private double consultationFee;

    //constructor to initialize Out Patient
    public OutPatient(int id, String name, int age,
                      String visitDate, double consultationFee) {
        super(id, name, age);
        this.visitDate = visitDate;
        this.consultationFee = consultationFee;
    }

    //Method to display patient details
    @Override
    public void displayInfo() {
        System.out.println(getSummary());
        System.out.println("Type: Out-Patient");
        System.out.println("Visit Date: " + visitDate);
        System.out.println("Consultation Fee: " + consultationFee);
    }

    //method to get Consultation Fees
    public double getConsultationFee() {
        return consultationFee;
    }
}
