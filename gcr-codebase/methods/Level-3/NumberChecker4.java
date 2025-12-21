//checking a number is spy, prime , neon, Automorphic, buzz
import java.util.Scanner;
public class NumberChecker4 {
    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        if (temp == 0) return 1;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int n = countDigits(number);
        int[] digits = new int[n];
        int temp = number;
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1){
			return false;
        }
		for (int i=2; i<=Math.sqrt(number); i++) {
            if (number%i==0){
				return false;
			}
		}
        return true;
    }

    // Method to check if a number is neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        int[] digits = storeDigits(square);
        for (int d : digits){
			sum += d;
        }
		return sum == number;
    }

    // Method to check if a number is spy
    public static boolean isSpy(int number) {
        int[] digits = storeDigits(number);
        int sum = 0, product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    // Method to check if a number is automorphic
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is buzz
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
	
		//creating scanner object
        Scanner sc = new Scanner(System.in);

		//input a number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

		//printing the results
        System.out.println("Is Prime? " + (isPrime(number) ? "Yes" : "No"));
        System.out.println("Is Neon? " + (isNeon(number) ? "Yes" : "No"));
        System.out.println("Is Spy? " + (isSpy(number) ? "Yes" : "No"));
        System.out.println("Is Automorphic? " + (isAutomorphic(number) ? "Yes" : "No"));
        System.out.println("Is Buzz? " + (isBuzz(number) ? "Yes" : "No"));

        sc.close();
    }
}
