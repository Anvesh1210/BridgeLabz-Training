package com.sorting.eventmanager;

// driver class
public class EventManagerDriver {

    public static void main(String[] args) {

        // creating ticket array
        Ticket[] tickets = {
            new Ticket(101, 1500),
            new Ticket(102, 500),
            new Ticket(103, 3000),
            new Ticket(104, 1200),
            new Ticket(105, 800)
        };

        // sorting tickets by price
        EventManager.quickSort(tickets, 0, tickets.length - 1);

        // printing sorted tickets
        System.out.println("Sorted Ticket Prices:");
        for (Ticket t : tickets) {
            System.out.println(t);
        }
    }
}
