//metro fare calculator
import java.util.Scanner;
public class MetroSmartCard{
    public static void main(String[] args) {
	
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: ₹");
        double balance = sc.nextDouble();

        char choice;
        do {
            if (balance <= 0) {
                System.out.println("Balance exhausted! Please recharge.");
                break;
            }

            System.out.print("\nEnter distance traveled in km: ");
            double distance = sc.nextDouble();

            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 10 :(distance <= 15) ? 20 :(distance <= 30) ? 30 : 40;

            System.out.println("Calculated Fare: ₹" + fare);

            // Deduct fare if balance is sufficient
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted. Remaining balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance for this trip!");
                break;
            }
			
            System.out.print("Do you want to take another trip? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

		//printing final balance
        System.out.println("\nThank you for using Delhi Metro Smart Card System.");
        System.out.println("Final Balance: ₹" + balance);

		//closing the Scanner
        sc.close();
    }
}
