//Number guessing game
import java.util.Scanner;
public class NumberGuessingGame {
    //method to generate remdom number between given range
    public static int generateGuess(int low, int high){
        return (int) (Math.random()*(high - low + 1))+low;
    }

    //method to gets feedback from the user
    public static String getUserFeedback(Scanner scanner){
        System.out.print("Is the guess too high, too low, or correct? ");
        return scanner.nextLine().toLowerCase();
    }

    //method to updates the guessing range based on feedback
    public static int[] updateRange(String feedback, int guess, int low, int high){
        if (feedback.equals("high")){
            high = guess - 1;
        } else if (feedback.equals("low")){
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {
		//creating scanner object 
        Scanner scanner = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean correct = false;
		
		//starting the game
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (!correct && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("\nMy guess is: " + guess);

            String feedback = getUserFeedback(scanner);

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number!");
                correct = true;
            } else if (feedback.equals("high") || feedback.equals("low")) {
                int[] range = updateRange(feedback, guess, low, high);
                low = range[0];
                high = range[1];
            } else {
                System.out.println("Please enter only: high, low, or correct.");
            }
        }
		
		
		//closing the scanner
        scanner.close();
    }
}
