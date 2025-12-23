//checking a string is palindrome or not 
import java.util.Scanner;
public class PalindromeCheck {
    //method to check string is palindrome or not
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    
    public static void main(String[] args) {
		//creating Scanner object 
        Scanner sc = new Scanner(System.in);
		
		//taking a String from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

		//calling isPalindrome() method and printing the result
        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

		//closing the Scanner object
        sc.close();
    }
}
