package com.sorting.tailorshop;

import java.util.ArrayList;

//class to represent Tailer shop
public class TailorShop {
    private ArrayList<Order> orders = new ArrayList<>();
    
    //method for adding new order
    public void addOrder(Order order) {
        orders.add(order);
        insertionSort();
    }

    //method for insertion sort based on delivery deadline
    private void insertionSort() {
        for (int i = 1; i < orders.size(); i++) {
            Order key = orders.get(i);
            int j = i - 1;
            while (j >= 0 &&
                   orders.get(j).getDeliveryDeadline() > key.getDeliveryDeadline()) {
                orders.set(j + 1, orders.get(j));
                j--;
            }
            orders.set(j + 1, key);
        }
    }

    //method for displaying orders
    public void displayOrders() {
        for (Order o : orders) {
            o.display();
        }
    }
}
