//Rohan's Library Fine Calculator
import java.util.Scanner;
public class RohansLibraryReminderApp {
    public static void main(String[] args) {
		
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
        int finePerMonth = 5;
        int daysInMoth = 30;
        int totalFine = 0;
		System.out.println("================================");
        System.out.println("Rohan's Library Fine Calculator");
		System.out.println("================================");

        // Loop for 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);

            System.out.print("Enter due day: ");
            int dueDay = sc.nextInt();

            System.out.print("Enter due month: ");
            int dueMonth = sc.nextInt();

            System.out.print("Enter return day: ");
            int returnDay = sc.nextInt();

            System.out.print("Enter return month: ");
            int returnMonth = sc.nextInt();

            int lateDays = 0;

            // Case 1: Returned in same month
            if (returnMonth == dueMonth) {
                if (returnDay > dueDay) {
                    lateDays = returnDay - dueDay;
                }
            }
            // Case 2: Returned in next month
            else if (returnMonth == dueMonth + 1) {
                lateDays = (daysInMoth - dueDay) + returnDay;
            }	
			
			//calculating total fine
            if (lateDays > 0) {
                int fine = lateDays * finePerMonth;
                totalFine += fine;

                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine for this book: Rs. " + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }
		
		//printing total fine
        System.out.println("\nTotal Fine to be Paid: Rs. " + totalFine);
		
		//closing the Scanner
        sc.close();
    }
}
