package com.petpalapplication;

public class PetPalApplication {
	public static void main(String[] args) {
		//random default pet
        Pet pet1 = new Dog("Buddy", 3);

        //user-specified pet
        Pet pet2 = new Cat("Luna", 2, 60, 50);

        pet1.makeSound();
        pet1.play();
        pet1.sleep();
        pet1.displayStatus();

        pet2.makeSound();
        pet2.feed();
        pet2.displayStatus();
    }
}
