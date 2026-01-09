package com.bookbazaar;

public class BookBazaarDriver {
    public static void main(String[] args) {
        //printed book
        Book printedBook = new PrintedBook( "Clean Code","Robert C. Martin",500,10);
        //EBook
        Book ebook = new EBook("Effective Java (EBook)","Joshua Bloch",400);
        //order printed book
        Order order1 = new Order("Anvesh", printedBook, 2);
        System.out.println("Printed Book Total: " + order1.placeOrder());
        System.out.println("Remaining Stock: " + printedBook.getStock());
        //order ebook
        Order order2 = new Order("Anvesh", ebook, 5);
        System.out.println("EBook Total: " + order2.placeOrder());
    }
}
