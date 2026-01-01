package com.inheritance.levelone;

public class AnimalDriver {
	public static void main(String[] args) {
		//making dog, cat and bird object
		Animal dog = new Dog("Tommy", 15);
		Animal cat = new Cat("Kitty", 10);
		Animal bird = new Bird("Tweety", 2);

		//calling makeSound() method for each object
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
		
		//printing age of each Animal
		System.out.println(dog.getName()+" age is : "+dog.getAge());
		System.out.println(cat.getName()+" age is : "+cat.getAge());
		System.out.println(bird.getName()+" age is : "+bird.getAge());
	}
}
