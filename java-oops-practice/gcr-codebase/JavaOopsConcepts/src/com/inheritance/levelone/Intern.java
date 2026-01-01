package com.inheritance.levelone;

//class to represent Intern
public class Intern  extends Employee {
    int durationMonths;

    //parameterized constructor
    Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    //override displayDetails method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Duration  : " + durationMonths + " months");
        System.out.println("Role      : Intern");
    }
    
}
