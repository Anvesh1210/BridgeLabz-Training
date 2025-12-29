import java.util.Scanner;
import java.util.Random;

//Number guessing game
public class NumberGuessingGame {
    public static void main(String[] args) {
		//creating scanner object
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
		
		//generating a random number between 1 to 100
        int number = rand.nextInt(100) + 1; 
        int guess;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have only 5 attempts.\n");
		
		//taking user input to match the number
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println(" Congratulations! You guessed the number in "+ attempts + " attempts.");
                break;
            }

            if (attempts < maxAttempts) {
                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

        } while (attempts < maxAttempts);

        if (guess != number) {
            System.out.println("\n Sorry! You've used all attempts.");
            System.out.println("The correct number was: " + number);
        }
		
		//closing the Scanner
        sc.close();
    }
}
