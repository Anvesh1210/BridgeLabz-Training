package com.petpalapplication;
//class representing a cat
public class Cat extends Pet {
	 //random state cat
    public Cat(String name, int age) {
        super(name, "Cat", age);
    }
    //user-specified state cat
    public Cat(String name, int age, int hunger, int energy) {
        super(name, "Cat", age, hunger, energy);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

