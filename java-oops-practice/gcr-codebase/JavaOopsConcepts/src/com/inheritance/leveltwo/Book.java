package com.inheritance.leveltwo;

public class Book {
	
	//Book attributes
    String title;
    int publicationYear;

    //Parameterized constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    //method to display details
    void displayInfo() {
        System.out.println("Book Title        : " + title);
        System.out.println("Publication Year  : " + publicationYear);
    }
}


