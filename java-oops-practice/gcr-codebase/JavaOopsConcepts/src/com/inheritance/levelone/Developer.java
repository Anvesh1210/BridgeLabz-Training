package com.inheritance.levelone;

//class to represent Developer
public class Developer extends Employee {
    String programmingLanguage;

    //parameterized Constructor
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    //overriding displayDetails() method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language  : " + programmingLanguage);
        System.out.println("Role      : Developer");
    }
}

