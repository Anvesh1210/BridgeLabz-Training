//getting the count of vovels and consonants in a word
import java.util.Scanner;
public class VowelConsonantCount{
    // Method to check if character is Vowel, Consonant, or Not a Letter
    public static String checkChar(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 65 && ch <= 90) {   
            ch = (char)(ch + 32);     
        }

        // Check if character is a letter
        if (ch >= 97 && ch <= 122) {
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants using charAt()
    public static int[] countVowelsAndConsonants(String s) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            String result = checkChar(s.charAt(i));
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[] { vowels, consonants };
    }

    public static void main(String[] args) {
		
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

		//getting a string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
		
		//calling the method to find the count of vovels and consonants
        int[] result = countVowelsAndConsonants(input);
		
		//printing the results
        System.out.println("\nNumber of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);
		
		//closing the scanner
        sc.close();
    }
}
