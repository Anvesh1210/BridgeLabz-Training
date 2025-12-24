//program that takes a date input and adds 7 days, 1 month, and 2 years to it. Then subtracts 3 weeks from the result.
import java.time.LocalDate;
import java.util.Scanner;
public class DateArithmetic {
    public static void main(String[] args) {
		
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking a date from th user
        System.out.print("Enter a date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());
		
		//calculating the date and time
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
		
		//printing the result
        System.out.println("Final Date after calculations: " + result);

        sc.close();
    }
}
