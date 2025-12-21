//program to check number is duck number, armstrong number, largestnumber, smallest number
import java.util.Scanner;
public class NumberChecker {
    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        if (temp == 0) return 1; // special case for 0
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int digitsCount = countDigits(number);
        int[] digits = new int[digitsCount];
        int temp = number;
        for (int i = digitsCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to check if number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // Duck number: 0 allowed at start, but non-zero exists
            if (digits[i] == 0) continue;
            if (digits[i] != 0) return true;
        }
        return false;
    }

    // Method to check if number is an Armstrong number
    public static boolean isArmstrong(int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        return sum == number;
    }

    // Method to find largest and second largest digits
    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[] {largest, secondLargest};
    }

    // Method to find smallest and second smallest digits
    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        return new int[] {smallest, secondSmallest};
    }

    
    public static void main(String[] args) {
	
		//creating scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking a number form the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitsCount = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Number of digits: " + digitsCount);
        System.out.print("Digits array: ");
        for (int d : digits){
			System.out.print(d + " ");
		}
		
		//printing all the values 
        System.out.println();
        System.out.println("Is Duck Number? " + (isDuckNumber(digits) ? "Yes" : "No"));
        System.out.println("Is Armstrong Number? " + (isArmstrong(digits) ? "Yes" : "No"));

        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest digit: " + largestTwo[0]);
        System.out.println("Second largest digit: " + largestTwo[1]);

        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest digit: " + smallestTwo[0]);
        System.out.println("Second smallest digit: " + smallestTwo[1]);

        sc.close();
    }
}
