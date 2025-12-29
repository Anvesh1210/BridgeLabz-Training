//Digital Parking Lot Gate System
import java.util.Scanner;
public class ParkingLotSystem{
	public static void main(String []args){
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		//defining parking capacity
		System.out.println("Welcome to digital parking lot System Application!");
		
		//taking parking capacity from the user
		System.out.print("Enter Parking Capacity: ");
		int parkingCapacity = input.nextInt();
		System.out.println();
		int choice=0;
		int occupacy = parkingCapacity;
		do{
			System.out.println("\nWhat option you want to perform");
			System.out.println("1. Park your Vehicle");
			System.out.println("2. Exit your Vehicle");
			System.out.println("3. Show Occupancy");
			System.out.println("4. Exit Application");
			System.out.println("----------------------------------");
			choice = input.nextInt();
			switch(choice){
				
				case 1:
					System.out.println("Park your vehicle");
					System.out.println("----------------------------------");
					if(occupacy<=0){
						System.out.println("Prking Area is full");
						System.out.println("----------------------------------");
					}else{
						occupacy--;
					}
					break;
				case 2:
					System.out.println("Exit your vehicle");
					System.out.println("----------------------------------");
					if(occupacy>=parkingCapacity){
						System.out.println("There is no vehicle in parking area!");
						System.out.println("----------------------------------");
					}else{
						occupacy++;
					}
					break;
				case 3:
					System.out.println("Parking Occupancy: "+ occupacy);4
					System.out.println("----------------------------------");
					break;
				case 4:
					System.out.println("Thank you for using the Application!");
					System.out.println("----------------------------------");
					break;
				default :
					System.out.println("Please select the correct option");
					System.out.println("----------------------------------");
					break;
			}
		}while(choice != 4);
		
		//closing the scanner
		
	}
}