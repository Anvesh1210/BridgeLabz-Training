//Fibonacci series upto given number
import java.util.Scanner;
public class FibonacciSeries{
    //function to calculate and print the Fibonacci sequence
    public static void printFibonacci(int terms) {
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci Sequence:");
        if (terms >= 1) {
            System.out.print(first + " ");
        }
        if (terms >= 2) {
            System.out.print(second + " ");
        }
        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static void main(String[] args){
		//creating Scanner object
        Scanner scanner = new Scanner(System.in);

		//taking a number from the user
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
		
		//checking the number and calling the function
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printFibonacci(terms);
        }

		//closing the Scanner
        scanner.close();
    }
}
