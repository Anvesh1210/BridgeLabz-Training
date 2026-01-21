package com.sorting.eventmanager;

public class Ticket {
    // ticket attributes
    int ticketId;
    double price;

    // constructor to initialize ticket
    public Ticket(int ticketId, double price) {
        this.ticketId = ticketId;
        this.price = price;
    }

    // overridden toString method
    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + ", Price: ₹" + price;
    }
}
