//program for Ravi's cafe store
import java.util.Scanner;
public class CoffeeCounterChronicles {
    public static void main(String[] args) {
		
		//creating scanner object
        Scanner scanner = new Scanner(System.in);

        final double GST_RATE = 0.05; // 5% GST
        int choice;
        System.out.println("Welcome to Ravi's Cafe");
		
		//while loop with true condition until user enter exit
        while (true) {
            // Display menu
            System.out.println("\nSelect Coffee Type:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Cappuccino");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for visiting Ravi's Cafe!");
                break;
            }

            double pricePerCup = 0;
            String coffeeType = "";

            // Select coffee using switch
            switch (choice) {
                case 1:
                    coffeeType = "Espresso";
                    pricePerCup = 80;
                    break;
                case 2:
                    coffeeType = "Latte";
                    pricePerCup = 100;
                    break;
                case 3:
                    coffeeType = "Cappuccino";
                    pricePerCup = 120;
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1, 2, 3 or 0.");
                    continue; // ask again
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            // Calculate bill
            double total = pricePerCup * quantity;
            double gst = total * GST_RATE;
            double finalBill = total + gst;

            // Display bill
            System.out.println("\n----- Bill Details -----");
            System.out.println("Coffee Type   : " + coffeeType);
            System.out.println("Price per Cup : " + pricePerCup);
            System.out.println("Quantity      : " + quantity);
            System.out.println("Total Amount  : " + total);
            System.out.println("GST (5%)      : " + gst);
			System.out.println("---------------------------");
            System.out.println("Final Bill    : " + finalBill);
        }
		
		//closing scanner object
        scanner.close();
    }
}
