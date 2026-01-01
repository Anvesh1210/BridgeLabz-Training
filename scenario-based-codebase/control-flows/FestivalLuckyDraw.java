import java.util.Scanner;
//Festival Lucky Draw
public class FestivalLuckyDraw {
    public static void main(String[] args) {

		//creating Scanner object
        Scanner sc = new Scanner(System.in);

		//taking number of visitors from user
        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        for (int i = 1; i <= visitors; i++) {

            System.out.print("\nVisitor " + i + " - Draw a number: ");
            int number = sc.nextInt();

            // Invalid input check
            if (number <= 0) {
                System.out.println("Invalid number. Try again.");
                continue;
            }

            // Lucky draw condition
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift.");
            } else {
                System.out.println("Sorry! Better luck next time.");
            }
        }
		
		System.out.println("\nLucky Draw Completed.");

		//closing the Scanner
        sc.close();
        
    }
}
