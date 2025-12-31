import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maxCapacity = 50;   
        int availableSeats = maxCapacity;

        char continueBooking='y';
		System.out.println("=================================================");
        System.out.println("-------Welcome to Movie Ticket Booking App-------");
		System.out.println("=================================================");
		
        System.out.println("\nTotal Seats Available: " + availableSeats);
		System.out.println("-------------------------------------------------");

        do {

            if (availableSeats == 0) {
                System.out.println("\nHouse Full! No seats available.");
                break;
            }

            double pricePerTicket = 0;
            double totalAmount = 0;

            // Movie selection
            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
            System.out.print("Enter choice: ");
            int movieChoice = sc.nextInt();

            switch (movieChoice) {
                case 1:
                    System.out.println("Selected Movie: Action");
                    pricePerTicket += 200;
                    break;
                case 2:
                    System.out.println("Selected Movie: Comedy");
                    pricePerTicket += 180;
                    break;
                case 3:
                    System.out.println("Selected Movie: Drama");
                    pricePerTicket += 150;
                    break;
                default:
                    System.out.println("Invalid movie choice");
                    continue;
            }

            // Seat type
            System.out.print("Select Seat Type (Gold/Silver): ");
            String seatType = sc.next();

            if (seatType.equalsIgnoreCase("Gold")) {
                pricePerTicket += 150;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                pricePerTicket += 100;
            } else {
                System.out.println("Invalid seat type");
                continue;
            }

            // Number of tickets
            System.out.print("Enter number of tickets: ");
            int numberOfTickets = sc.nextInt();

            if (numberOfTickets <= 0) {
                System.out.println("Invalid ticket count");
                continue;
            }

            if (numberOfTickets > availableSeats) {
                System.out.println("Only " + availableSeats + " seats are available.");
                continue;
            }

            // Snacks option
            System.out.print("Do you want snacks? (yes/no): ");
            String snacksChoice = sc.next();

            if (snacksChoice.equalsIgnoreCase("yes")) {
                pricePerTicket += 80;
            }

            // Calculate bill
            totalAmount = pricePerTicket * numberOfTickets;
            availableSeats -= numberOfTickets;

            // Display summary
            System.out.println("\nBooking Successful!");
            System.out.println("Tickets Booked: " + numberOfTickets);
            System.out.println("Total Amount: Rs. " + totalAmount);
            System.out.println("Remaining Seats: " + availableSeats);

            // Next customer
            System.out.print("\nBook ticket for next customer? (y/n): ");
            continueBooking = sc.next().charAt(0);

        } while (continueBooking == 'y' || continueBooking == 'Y');

        System.out.println("\nThank you for using the Movie Ticket Booking App");
        sc.close();
    }
}
