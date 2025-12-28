package com.constructor.levelone;

//class to store book details
public class LibraryBook {
    //Data members with access modifiers
    public String ISBN;
    protected String title;
    private String author;

    //Parameterized constructor
    public LibraryBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        setAuthor(author);
    }

    //public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    //public getter for author
    public String getAuthor() {
        return author;
    }

    // Display book details
    public void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

