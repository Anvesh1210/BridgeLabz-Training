//program that performs basic mathematical operations (addition,subtraction, multiplication, division)
import java.util.Scanner;
public class BasicCalculator {
    //addition method
    public static double add(double a, double b) {
        return a + b;
    }

    //subtraction method
    public static double subtract(double a, double b) {
        return a - b;
    }

    //multiplication method
    public static double multiply(double a, double b) {
        return a * b;
    }

    //division method
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args){
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking operation and two numbers from the user
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

		//calling function with switch case
        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + divide(num1, num2));
                break;
            default:
                System.out.println("Invalid choice");
        }
	
		//closing the Scanner
        sc.close();
    }
}
