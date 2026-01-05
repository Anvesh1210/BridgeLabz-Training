package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

import java.util.Scanner;

public class OnlineTicketReservationSystem {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicketReservation tr = new TicketReservation();
        int ch;

        do {
            System.out.println("\n1.Add Ticket 2.Remove Ticket");
            System.out.println("3.Search Customer 4.Search Movie");
            System.out.println("5.Display Tickets 6.Count Tickets");
            System.out.println("0.Exit");

            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Customer Name: ");
                    String c = sc.nextLine();
                    System.out.print("Movie Name: ");
                    String m = sc.nextLine();
                    System.out.print("Seat No: ");
                    String s = sc.nextLine();
                    System.out.print("Booking Time: ");
                    String t = sc.nextLine();

                    tr.addTicket(id, c, m, s, t);
                    break;

                case 2:
                    tr.removeTicket(sc.nextInt());
                    break;

                case 3:
                    tr.searchByCustomer(sc.nextLine());
                    break;

                case 4:
                    tr.searchByMovie(sc.nextLine());
                    break;

                case 5:
                    tr.displayAll();
                    break;

                case 6:
                    System.out.println("Total Tickets: " + tr.countTickets());
                    break;
            }

        } while (ch != 0);

        sc.close();
    }
}
