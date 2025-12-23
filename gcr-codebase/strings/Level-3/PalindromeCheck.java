import java.util.Scanner;
public class PalindromeCheck {

    // LOGIC 1: Iterative comparison using start & end index
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // LOGIC 2: Recursive comparison
    public static boolean isPalindromeRecursive(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    //method Reverse string using charAt()
    public static char[] reverseString(String text) {
        int len = text.length();
        char[] reverse = new char[len];

        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }
        return reverse;
    }

    // LOGIC 3: Using character arrays
    public static boolean isPalindromeUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
	
		//taking a String from user
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

		//priting the result
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Iterative): " +(isPalindromeIterative(input) ? "Palindrome" : "Not Palindrome"));
		
        System.out.println("Logic 2 (Recursive): " +(isPalindromeRecursive(input, 0, input.length() - 1) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Logic 3 (Using Arrays): " +(isPalindromeUsingArray(input) ? "Palindrome" : "Not Palindrome"));
		
		//closing the scanner
        sc.close();
    }
}
