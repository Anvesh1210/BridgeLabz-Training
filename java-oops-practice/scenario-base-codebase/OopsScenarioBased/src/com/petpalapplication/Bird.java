package com.petpalapplication;
//class representing a bird
public class Bird extends Pet {
	 //random state bird
    public Bird(String name, int age) {
        super(name, "Bird", age);
    }
    //user-specified state bird
    public Bird(String name, int age, int hunger, int energy) {
        super(name, "Bird", age, hunger, energy);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp!");
    }
}
