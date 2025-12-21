//program to find number is Perfect, Abundant, Deficient, Strong
import java.util.Scanner;
public class NumberChecker5 {

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int count = 0;
        int temp = number;
        if (temp == 0) return new int[]{0};
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to calculate sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i=1;i<=number/2;i++){
            if(number%i==0){
				sum += i;
			}
		}
        return sum;
    }

    // Method to check if number is perfect
    public static boolean isPerfect(int number) {
        return number > 0 && sumOfProperDivisors(number) == number;
    }

    // Method to check if number is abundant
    public static boolean isAbundant(int number) {
        return number > 0 && sumOfProperDivisors(number) > number;
    }

    // Method to check if number is deficient
    public static boolean isDeficient(int number) {
        return number > 0 && sumOfProperDivisors(number) < number;
    }

    // Method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // Method to check if number is strong
    public static boolean isStrong(int number) {
        int[] digits = storeDigits(number);
        int sumFact = 0;
        for (int d : digits) sumFact += factorial(d);
        return sumFact == number;
    }

    public static void main(String[] args) {
		//creating scanenr object
        Scanner sc = new Scanner(System.in);

		//taking a input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

		//printing the output
        System.out.println("Is Perfect? " + (isPerfect(number) ? "Yes" : "No"));
        System.out.println("Is Abundant? " + (isAbundant(number) ? "Yes" : "No"));
        System.out.println("Is Deficient? " + (isDeficient(number) ? "Yes" : "No"));
        System.out.println("Is Strong? " + (isStrong(number) ? "Yes" : "No"));
		
		//closing scanner object
        sc.close();
    }
}
