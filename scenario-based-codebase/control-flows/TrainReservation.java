// Train Reservation Queue 
import java.util.Scanner;
public class TrainReservation{
	public static void main(String []args){
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("===============================================");
		System.out.println("Welcome to online Train Reservation application");
		System.out.println("===============================================");
		
		int totalSeats = 10;
		int availableSeats = totalSeats;
		
		int choice = 0;
		do{
			//printing options for the user
			System.out.println("\n\nEnter option you want to do:");
			System.out.println("1. Book Ticket.");
			System.out.println("2. Canccel Ticket.");
			System.out.println("3. Show Available Seats.");
			System.out.println("4. Exit from Application.");
			
			//taking choice from user
			System.out.print("Enter Choice: ");
			choice = input.nextInt();
			System.out.println();
			
			//switch case according to user choice
			switch(choice){
			
				case 1:
					if(availableSeats>0 && availableSeats<=totalSeats){
						System.out.print("Enter number of seats you want to book: ");
						int number = input.nextInt();
						System.out.println();
						if(availableSeats>number){
							System.out.println("Seat Booked!!! ");
							availableSeats-=number;
						}else{
							System.out.println(number+" Seats are not Available");
							System.out.println("Available Seats: "+availableSeats);
						}
					}else{
						System.out.println("No more seat Available!");
						choice=4;
					}
					break;
				
				case 2:
					if(availableSeats<totalSeats && availableSeats>=0){
						System.out.print("Enter number of ticket you want to cancel: ");
						int number = input.nextInt();
						System.out.println();
						if((totalSeats-availableSeats)>number){
							System.out.println("Ticket Cancelled");
							availableSeats+=number;
						}else{
							System.out.println("There are only "+(totalSeats-availableSeats)+" seats which is booked");
						}
					}else{
						System.out.println("There are no booking in the Queue");
					}
					break;
					
				case 3:
					System.out.println("Available Seats: "+availableSeats);
					break;
				
			}
		}while(choice !=4);
		
		//printing thankyou message
		System.out.println("Thank You for using the Application");
		
		//closing the Scanner
		input.close();
	}
}