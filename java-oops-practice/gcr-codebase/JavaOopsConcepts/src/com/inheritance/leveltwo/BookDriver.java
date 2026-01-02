package com.inheritance.leveltwo;

public class BookDriver {
	public static void main(String[] args) {

		//creating book objects
        Author book1 = new Author("Effective Java",2018,"Joshua Bloch","Expert in Java and software design principles");

        //displaying details
        System.out.println("---- Book & Author Details ----\n");
        book1.displayInfo();
    }
}