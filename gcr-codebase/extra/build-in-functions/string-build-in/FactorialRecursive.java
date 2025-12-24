//factorial of given number using recursion
import java.util.Scanner;
public class FactorialRecursive {
    //function to take input from the user
    public static int getInput(Scanner scanner) {
        System.out.print("Enter a non-negative number: ");
        return scanner.nextInt();
    }

    //recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //function to display the result
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //calling functions
        int number = getInput(scanner);

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
			
            displayResult(number, result);
        }
		
		//closing the Scanner 
        scanner.close();
    }
}
