package com.generics.dynamiconlinemarketplace;

//class to represent Book Category
public class BookCategory implements Category {

    @Override
    public String getCategoryName() {
        return "Books";
    }
}