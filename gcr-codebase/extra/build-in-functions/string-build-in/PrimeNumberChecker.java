//checking a number is prime or not
import java.util.Scanner;
public class PrimeNumberChecker{

    //function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
		//creating Scanner object
        Scanner scanner = new Scanner(System.in);
		
		//taking a number from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
		
		//calling function and printing the result
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
		
		//closing the Scanner
        scanner.close();
    }
}
