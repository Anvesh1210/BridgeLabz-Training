package com.constructor.levelone;

//Driver class for testing Person class
public class PersonDriver {
	public static void main(String[] args) {
		//creating object of Person class with parameterize constructor
		Person firstPerson = new Person("Anvesh",20);
		
		//creating object of Person class with copy constructor and passing firstPerson in it.
		Person secondPerson = new Person(firstPerson);
		
		//calling show() method for both the objects
		firstPerson.show();
		secondPerson.show();
	}
}
