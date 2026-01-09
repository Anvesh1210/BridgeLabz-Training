package com.bookbazaar;

public abstract class Book implements IDiscountable {
	//Book Attributes
    protected String title;
    protected String author;
    protected double price;
    protected int stock;

    //constructor to initialize book attributes
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    //encapsulated stock update
    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            throw new RuntimeException("Not enough stock");
        }
    }

    //getter method to get book stock
    public int getStock() {
        return stock;
    }

    //getter method to get book price
    public double getPrice() {
        return price;
    }
}
