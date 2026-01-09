package com.bookbazaar;

public class Order {
	//order attributes
    private String user;
    private Book book;
    private int quantity;
    private String orderStatus;

    //constructor to initialize order attributes
    public Order(String user, Book book, int quantity) {
        this.user = user;
        this.book = book;
        this.quantity = quantity;
        this.orderStatus = "CREATED";
    }

    public double placeOrder(){
        //update inventory safely
        book.reduceStock(quantity);

        double totalPrice = book.getPrice() * quantity;
        double discountedPrice = book.applyDiscount(totalPrice);

        orderStatus = "PLACED";
        return discountedPrice;
    }

    //csontrolled access
    public String getOrderStatus() {
        return orderStatus;
    }
}