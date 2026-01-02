package com.inheritance.leveltwo;

//Base class representing a common person in school
public class Person {

    //person class attributes
    protected String name;
    protected int age;

    //constructor to initialize common details
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //displays basic person details
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    // Method to display role 
    public void displayRole() {
        System.out.println("Role : Person");
    }
}
