//counting vowels and consonants in a String
import java.util.Scanner;

public class CountVowelsAndConsonants{

    //method to find vowels and consonants in a String
    public static void countVowelsAndConsonants(String str){
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking a string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        //calling function to count and print vowels and consonants
        countVowelsAndConsonants(input);

		//closing the Scanner
        sc.close();
    }
}
