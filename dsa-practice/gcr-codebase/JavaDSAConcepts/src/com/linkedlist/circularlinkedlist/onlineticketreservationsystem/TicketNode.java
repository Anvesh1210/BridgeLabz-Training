package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

//class to represent a Ticket Node
public class TicketNode {
	//ticket attributes
	int ticketId;
    String customerName;
    String movieName;
    String seatNo;
    String bookingTime;
    TicketNode next;

    //constructor to initialize ticket attributes
    TicketNode(int ticketId, String customerName, String movieName,String seatNo, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNo = seatNo;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
