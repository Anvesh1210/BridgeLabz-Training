package com.petpalapplication;

import java.util.Random;
//class to representing a Pet
public abstract class Pet implements IInteractable {
    protected String name;
    protected String type;
    protected int age;

    //encapsulated internal states
    private int hunger;   // 0 = full, 100 = very hungry
    private int energy;   // 0 = tired, 100 = energetic
    private String mood;

    //constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(40) + 30;
        this.energy = r.nextInt(40) + 30;

        updateMood();
    }

    //constructor
    public Pet(String name, String type, int age, int hunger, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;

        updateMood();
    }

    //method for pet sound
    public abstract void makeSound();

    //feed decreases hunger
    @Override
    public void feed() {
        hunger -= 20;
        if (hunger < 0) hunger = 0;
        updateMood();
    }

    //play increases hunger and decreases energy
    @Override
    public void play() {
        hunger += 15;
        energy -= 20;
        normalize();
        updateMood();
    }

    //sleep increases energy
    @Override
    public void sleep() {
        energy += 30;
        normalize();
        updateMood();
    }

    //mood is controlled internally only
    private void updateMood() {
        if (energy > 60 && hunger < 40)
            mood = "Happy";
        else if (energy < 30 || hunger > 70)
            mood = "Sad";
        else
            mood = "Normal";
    }

    private void normalize() {
        if (energy > 100) energy = 100;
        if (energy < 0) energy = 0;
        if (hunger > 100) hunger = 100;
    }

    public void displayStatus() {
        System.out.println("\nPet Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
    }
}