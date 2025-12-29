//Phone Recharge Simulator 
import java.util.Scanner;
public class PhoneRecharge {
    public static void main(String[] args) {
		
		//creating Scanner objecct
        Scanner sc = new Scanner(System.in);

        double balance = 0.0;
        char continueChoice;

        System.out.println("========================================");
        System.out.println("        PHONE RECHARGE SIMULATOR         ");
        System.out.println("========================================");

        do {
            System.out.println("\nSelect Your Mobile Operator");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. Vi");
            System.out.print("Enter operator choice: ");
            int operator = sc.nextInt();

            System.out.print("Enter recharge amount (Rs): ");
            double amount = sc.nextDouble();

            // Update balance
            balance += amount;

            System.out.println("\nRecharge Details");
            System.out.println("----------------------------------------");

            // Display offers using switch
            switch (operator) {
                case 1:
                    System.out.println("Operator : Jio");
                    System.out.println("Offer    : 2GB/day data with unlimited calls");
                    break;

                case 2:
                    System.out.println("Operator : Airtel");
                    System.out.println("Offer    : 1.5GB/day data with 100 SMS/day");
                    break;

                case 3:
                    System.out.println("Operator : Vi");
                    System.out.println("Offer    : 1GB/day data with weekend rollover");
                    break;

                default:
                    System.out.println("Invalid operator selected");
                    System.out.println("Recharge amount added without offer");
            }

            System.out.println("Recharge Amount : Rs " + amount);
            System.out.println("Available Balance : Rs " + balance);

            System.out.println("\n----------------------------------------");
            System.out.print("Do you want to recharge again? (Y/N): ");
            continueChoice = sc.next().toUpperCase().charAt(0);

        } while (continueChoice == 'Y');

        System.out.println("\n===============================================");
        System.out.println("Thank you for using the Phone Recharge Simulator!");
        System.out.println("=================================================");

		//closing Scanner object
        sc.close();
    }
}
