package com.fittrackapplication;

public class UserProfile {
	//user attributes
    private String name;
    private int age;
    private double weight;   // sensitive health data (private)
    private String goal;

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = "Stay Fit";
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    // Controlled access to weight
    public double getWeight() {
        return weight;
    }

    public String getGoal() {
        return goal;
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Goal: " + goal);
    }
}

