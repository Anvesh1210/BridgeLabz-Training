package com.polymorphismandencapsulation.employeemanagementsystem;

//Class to represent Part Time Employee 
public class PartTimeEmployee extends Employee{
	private int hoursWorked;
    private double hourlyRate;

    //Parameterized constructor
    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, hourlyRate*hoursWorked);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    //overridden method to calculate salary
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
