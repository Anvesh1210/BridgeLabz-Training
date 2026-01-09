package com.bookbazaar;

public class EBook extends Book{
    public EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE);
    }

    @Override
    public void reduceStock(int quantity) {
    }

    @Override
    public double applyDiscount(double price) {
        // 30% discount
        return price * 0.70;
    }
}
