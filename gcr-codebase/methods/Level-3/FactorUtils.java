//program to find Greatest Factor, Sum of Factors, Product of Factors , Product of Cubes of Factors
import java.util.Scanner;
public class FactorUtils{
    // Method to find factors of a number and return as array
    public static int[] findFactors(int number) {
        
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        // Store factors in array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor using the factors array
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method to find the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Method to find the product of the cubes of the factors
    public static long productOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Main method to test all functions
    public static void main(String[] args) {
		//creating scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking a input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		//calling function
        int[] factors = findFactors(number);
		
		
		//displaying the results
        System.out.print("Factors of " + number + ": ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factors));

        sc.close();
    }
}
