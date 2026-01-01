package com.inheritance.levelone;

//class to represent Manager
public class Manager extends Employee {
    int teamSize;
    
    //parameterized constructor
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    //overriding displayDetails() method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : " + teamSize);
        System.out.println("Role      : Manager");
    }
}
