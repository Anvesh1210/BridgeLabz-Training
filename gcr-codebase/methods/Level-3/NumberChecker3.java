//reversing a number, checking it is palindrome or not, duck or not
import java.util.Scanner;
public class NumberChecker3 {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        if (temp == 0) return 1; 
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int n = countDigits(number);
        int[] digits = new int[n];
        int temp = number;
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to reverse a digits array
    public static int[] reverseDigits(int[] digits) {
        int n = digits.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = digits[n - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check if a number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // ignore leading digit
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
		
		//creating scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking number form user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		//printing the date by method calls
        int[] digits = storeDigits(number);
        System.out.println("Number of digits: " + countDigits(number));

        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        int[] reversed = reverseDigits(digits);
        System.out.print("Reversed digits array: ");
        for (int d : reversed) System.out.print(d + " ");
        System.out.println();

        System.out.println("Is Palindrome? " + (isPalindrome(digits) ? "Yes" : "No"));
        System.out.println("Is Duck Number? " + (isDuckNumber(digits) ? "Yes" : "No"));

		//closing scanner object
        sc.close();
    }
}
