package com.foodloopapplication;

public class FoodLoopApplication {
    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Aalu Paratha", 500, 20);
        FoodItem item2 = new NonVegItem("Chicken Roll", 120, 10);
        Order order1 = new Order(101);
        order1.addItem(item1);
        order1.addItem(item2);
        order1.placeOrder();
    }
}
