package com.polymorphismandencapsulation.librarymanagementsystem;

//class to represent a Book
public class Book extends LibraryItem implements Reservable {

 public Book(String itemId, String title, String author) {
     super(itemId, title, author);
 }

 //books can be issued for 14 days
 @Override
 public int getLoanDuration() {
     return 14;
 }

 @Override
 public void reserveItem() {
     if (isAvailable()) {
         setBorrower("Reserved User");
         System.out.println("Book reserved successfully.");
     } else {
         System.out.println("Book is already reserved.");
     }
 }

 @Override
 public boolean checkAvailability() {
     return isAvailable();
 }
}

