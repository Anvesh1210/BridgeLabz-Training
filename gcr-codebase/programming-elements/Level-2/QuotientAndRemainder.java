//program to take 2 numbers and print their quotient and reminder
import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {

        
        // Input two numbers
	Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output result
        System.out.println("The Quotient is " + quotient +" and Remainder is " + remainder +" of two number " + number1 + " and " + number2);

        input.close();
    }
}
