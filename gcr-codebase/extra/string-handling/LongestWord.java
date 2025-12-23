//finding longest word in a String
import java.util.Scanner;
public class LongestWord {

    //method to find longest word in a String
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

		//taking a String form the user
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

		//calling the method
        String result = findLongestWord(input);

		//printing the result
        System.out.println("Longest word: " + result);

		//closing the Scanner
        sc.close();
    }
}
