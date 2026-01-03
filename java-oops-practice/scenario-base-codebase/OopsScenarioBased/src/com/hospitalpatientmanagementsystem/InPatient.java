package com.hospitalpatientmanagementsystem;

//class to represent InPatient
public class InPatient extends Patient {
	
	//InPatient attributes
    private int roomNumber;
    private int daysAdmitted;

    //constructor to initialize InPatient
    public InPatient(int id, String name, int age, String history,int roomNumber, int daysAdmitted) {
        super(id, name, age, history);
        this.roomNumber = roomNumber;
        this.daysAdmitted = daysAdmitted;
    }

    //Method to display patient details
    @Override
    public void displayInfo() {
        System.out.println(getSummary());
        System.out.println("Type: In-Patient");
        System.out.println("Room No: " + roomNumber);
        System.out.println("Days Admitted: " + daysAdmitted);
    }

    //method to get how many days patient admitted
    public int getDaysAdmitted() {
        return daysAdmitted;
    }
}
