//Finding first non-repeating character in a String
import java.util.Scanner;
public class FirstNonRepeatingChar {

    // Method to find first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; 

        //Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        //Find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        // If no non-repeating character found
        return '\0';
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

		//Enter a string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);
		
		//printing the result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
		
		//closing the Scanner
        sc.close();
    }
}
