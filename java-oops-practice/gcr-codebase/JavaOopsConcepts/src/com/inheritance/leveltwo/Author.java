package com.inheritance.leveltwo;

public class Author extends Book {
	
	//Author attributes
    String name;
    String bio;

    //parameterized constructor
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    
    //Overridden method : displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name       : " + name);
        System.out.println("Author Bio        : " + bio);
    }
}