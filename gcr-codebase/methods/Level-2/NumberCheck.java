//checking positive or negative and even or odd
import java.util.Scanner;
public class NumberCheck {

    // Method to check whether the number is positive or negative
    public static String isPositive(int number) {
        if(number > 0){
            return "positive";
        }else if(number < 0){
            return "negative";
        }else{
            return "zero";
        }
    }

    // Method to check whether the number is even or odd
    public static String isEven(int number){
        if(number % 2 == 0){
            return "even";
        }else{
            return "odd";
        }
    }

    // Method to compare two numbers and return 1 if num1 > num2, 0 if equal, -1 if num1 < num2
    public static int compare(int num1, int num2){
        if(num1 > num2){
            return 1; 
        }else if(num1 < num2){
            return -1; 
        }else{
            return 0; 
        }
    }

    public static void main(String[] args){
		//creating scanner object 
        Scanner input = new Scanner(System.in);

        // Taking 5 numbers from the user
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Loop through the array and check if positive, negative, and if positive, check even or odd
        for (int i = 0; i < numbers.length; i++) {
            String positivity = isPositive(numbers[i]);
            if(positivity.equals("positive")) {
                // If the number is positive, check if it is even or odd
                String evenOdd = isEven(numbers[i]);
                System.out.println("The number " + numbers[i] + " is positive and " + evenOdd);
            }else if (positivity.equals("negative")) {
                System.out.println("The number " + numbers[i] + " is negative");
            }else{
                System.out.println("The number " + numbers[i] + " is zero");
            }
        }

        // Compare the first and last elements of the array using the compare method
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        
        // Display the result of the comparison
        if(comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        }else if(comparisonResult == -1) {
            System.out.println("The first number is less than the last number.");
        }else{
            System.out.println("The first number and the last number are equal.");
        }

        // Closing the Scanner
        input.close();
    }
}
