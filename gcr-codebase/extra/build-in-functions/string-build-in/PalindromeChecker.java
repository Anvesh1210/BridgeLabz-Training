//checking the given string is palindrome or not
import java.util.Scanner;
public class PalindromeChecker{

    //function to check if the string is a palindrome
    public static boolean isPalindrome(String text) {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //function to display the result
    public static void displayResult(String text, boolean result) {
        if (result) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
		//creating scanner object
        Scanner scanner = new Scanner(System.in);

        //taking a string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

		//calling the function
        boolean result = isPalindrome(input);
        displayResult(input, result);
		
		//closing the scanner
        scanner.close();
    }
}
