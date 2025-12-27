//vote pooling system
import java.util.Scanner;
public class ElectionBooth{
    public static void main(String[] args){
	
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
        int vote1 = 0, vote2 = 0, vote3 = 0;

        while (true) {
            System.out.print("\nEnter age of voter (or -1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                break;
            }

            // Check voter eligibility
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.println("Cast your vote:");
                System.out.println("1. Candidate 1");
                System.out.println("2. Candidate 2");
                System.out.println("3. Candidate 3");
                System.out.print("Enter your choice (1/2/3): ");

                int choice = sc.nextInt();

                if (choice == 1) {
                    vote1++;
                    System.out.println("Vote recorded for Candidate 1.");
                } else if (choice == 2) {
                    vote2++;
                    System.out.println("Vote recorded for Candidate 2.");
                } else if (choice == 3) {
                    vote3++;
                    System.out.println("Vote recorded for Candidate 3.");
                } else {
                    System.out.println("Invalid choice! Vote not recorded.");
                }
            } else {
                System.out.println("You are not eligible to vote. Age must be 18 or above.");
            }
        }

        //priniting results
        System.out.println("\n--- Voting Results ---");
        System.out.println("Candidate 1: " + vote1 + " votes");
        System.out.println("Candidate 2: " + vote2 + " votes");
        System.out.println("Candidate 3: " + vote3 + " votes");

        System.out.println("Thank you for using Election Booth Manager.");
		
		//closing the Scanner
        sc.close();
    }
}
