//Calculting frequency of digits in a number using array
import java.util.Scanner;
class FrequencyCount{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a Number
		System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		int temp = number;
        int count = 0;

        // Find count of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];

        // Store digits in array
        temp = number;
        int index = 0;
        while(temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }


        int[] frequency = new int[10];

        // Calculate frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
	
		//closing the Scanner
        input.close();
	}
}