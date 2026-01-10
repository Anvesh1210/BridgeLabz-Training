package com.foodloopapplication;

public class FoodItem {

    private String name;
    protected String category;
    private double price;
    private int stock;

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public void displayDetails() {
        System.out.println("Food Item Details:");
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }

    public boolean checkAvailability(int qty) {
        return stock >= qty;
    }

    public void decreaseStock(int qty) {
        stock -= qty;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
