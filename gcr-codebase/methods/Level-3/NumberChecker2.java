//program to get sum of digits, power, harshad number, frequency of digit
import java.util.Scanner;
public class NumberChecker2 {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        if (temp == 0){
			return 1; 
        }
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
        for (int i = n - 1; i >= 0; i--){
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits){
			sum += d;
		}
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits){
			sum += Math.pow(d, 2);
		}
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; 
        for (int i = 0; i < 10; i++){
			freq[i][0] = i;
		}
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Number of digits: " + countDigits(number));

        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number? " + (isHarshad(number, digits) ? "Yes" : "No"));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " time");
            }
        }
		
		//closing scanner object
        sc.close();
    }
}
