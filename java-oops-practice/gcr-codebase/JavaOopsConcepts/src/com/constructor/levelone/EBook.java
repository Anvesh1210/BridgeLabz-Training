package com.constructor.levelone;

public class EBook extends LibraryBook {
    private double fileSize;
    //parameterized Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    //method to display book
    public void displayEBook() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
    }
}

