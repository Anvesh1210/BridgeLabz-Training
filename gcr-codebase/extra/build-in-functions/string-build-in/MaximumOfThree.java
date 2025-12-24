//finding maximum between three numbers
import java.util.Scanner;
public class MaximumOfThree{
    // Function to take three integers from the user
    public static int[] getInput(Scanner scanner) {
        int[] numbers = new int[3];

		//taking three numbers from the user
        System.out.print("Enter first number: ");
        numbers[0] = scanner.nextInt();
        System.out.print("Enter second number: ");
        numbers[1] = scanner.nextInt();
        System.out.print("Enter third number: ");
        numbers[2] = scanner.nextInt();

        return numbers;
    }

    //function to calculate the maximum of three numbers
    public static int findMaximum(int[] numbers) {
        int max = numbers[0];

        if (numbers[1] > max) {
            max = numbers[1];
        }
        if (numbers[2] > max) {
            max = numbers[2];
        }

        return max;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner scanner = new Scanner(System.in);
	
		//calling the methods
        int[] numbers = getInput(scanner);
        int max = findMaximum(numbers);

		//priting the results
        System.out.println("The maximum number is: " + max);

		//closing the Scanner
        scanner.close();
    }
}
