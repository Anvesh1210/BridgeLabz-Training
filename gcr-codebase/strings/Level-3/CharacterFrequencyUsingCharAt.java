//finding Character Frequency Using CharAt() method
import java.util.Scanner;
public class CharacterFrequencyUsingCharAt {

    // Method to find frequency and return 2D array
    public static String[][] findCharacterFrequency(String text) {

        int[] freq = new int[256];

        //Count frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        //Count number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        //Create 2D array for result
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        //Store characters and their frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // Avoid duplicate entries
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

		//taking a String from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencyData = findCharacterFrequency(input);

		//printing the results
        System.out.println("\nCharacter\tFrequency");
        

        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(
                frequencyData[i][0] + "\t\t" + frequencyData[i][1]
            );
        }

		//closing the Scanner
        sc.close();
    }
}
