package com.petpalapplication;

//class representing a Dog
public class Dog extends Pet{
	 //random state dog
    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    //user-specified state dog
    public Dog(String name, int age, int hunger, int energy) {
        super(name, "Dog", age, hunger, energy);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}
