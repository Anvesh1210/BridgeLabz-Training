//finding GCD and LCM of two numbers
import java.util.Scanner;
public class GCDLCMCalculator{
    //function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    //function to calculate LCM using GCD
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    public static void main(String[] args){
		//creating Scanner object
        Scanner scanner = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        //calling functions
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        //showing the results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

		//closing the Scanner
        scanner.close();
    }
}
