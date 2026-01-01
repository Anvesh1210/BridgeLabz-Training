import java.util.Scanner;
//Currency Converter Application
public class CurrencyConverter{
    public static void main(String[] args) {

		//creating Scanner object
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();

            System.out.println("Choose target currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            System.out.println("4. JPY");
            System.out.print("Enter your choice: ");
			
            int option = sc.nextInt();
            double convertedAmount = 0.0;

            switch (option) {
                case 1:
                    convertedAmount = inr * 0.012; // USD rate
                    System.out.println("Converted Amount in USD: " + convertedAmount);
                    break;

                case 2:
                    convertedAmount = inr * 0.011; // EUR rate
                    System.out.println("Converted Amount in EUR: " + convertedAmount);
                    break;

                case 3:
                    convertedAmount = inr * 0.0095; // GBP rate
                    System.out.println("Converted Amount in GBP: " + convertedAmount);
                    break;

                case 4:
                    convertedAmount = inr * 1.80; // JPY rate
                    System.out.println("Converted Amount in JPY: " + convertedAmount);
                    break;

                default:
                    System.out.println("Invalid currency choice.");
            }
            System.out.print("\nDo you want another conversion? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

		System.out.println("\nThank you for using Currency Exchange Kiosk.");
		
		//closing the Scanner
        sc.close();
        
    }
}
