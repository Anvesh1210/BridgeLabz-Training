package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class TicketReservation {
	private TicketNode head;
    private TicketNode tail;

    //method to add ticket at end
    public void addTicket(int id, String cname, String mname,
                   String seat, String time) {

        TicketNode n = new TicketNode(id, cname, mname, seat, time);

        if (head == null) {
            head = tail = n;
            n.next = head;
            return;
        }

        tail.next = n;
        n.next = head;
        tail = n;
    }

    //method to remove ticket by ID
    public void removeTicket(int id) {

        if (head == null) return;

        TicketNode curr = head;
        TicketNode prev = tail;

        do {
            if (curr.ticketId == id) {

                if (curr == head && curr == tail) {
                    head = tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == head) head = curr.next;
                    if (curr == tail) tail = prev;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    //method to search by customer name
    public void searchByCustomer(String name) {

        if (head == null) return;

        TicketNode t = head;
        do {
            if (t.customerName.equalsIgnoreCase(name))
                displayTicket(t);
            t = t.next;
        } while (t != head);
    }

    //method to search by movie name
    public void searchByMovie(String movie) {

        if (head == null) return;

        TicketNode t = head;
        do {
            if (t.movieName.equalsIgnoreCase(movie))
                displayTicket(t);
            t = t.next;
        } while (t != head);
    }

    //method to display all tickets
    public void displayAll() {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode t = head;
        do {
            displayTicket(t);
            t = t.next;
        } while (t != head);
    }

    //count tickets
    int countTickets() {

        if (head == null) return 0;

        int count = 0;
        TicketNode t = head;
        do {
            count++;
            t = t.next;
        } while (t != head);

        return count;
    }

    private void displayTicket(TicketNode t) {
        System.out.println("ID: " + t.ticketId +", Customer: " + t.customerName +", Movie: " + t.movieName +", Seat: " + t.seatNo +", Time: " + t.bookingTime);
    }
}
