//Sting frequency using unique characters
import java.util.Scanner;
public class FrequencyUsingUniqueChars {

    // method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = current;
                count++;
            }
        }

        // Create exact-sized array
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // Method to Find frequency using unique characters
    public static String[][] findFrequency(String text) {

        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        char[] uniqueChars = uniqueCharacters(text);

        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

		//Taking a String from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencyData = findFrequency(input);

		//printing the results
        System.out.println("\nCharacter\tFrequency");
		System.out.println();

        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(
                frequencyData[i][0] + "\t\t" + frequencyData[i][1]
            );
        }

		//closing the Scanner
        sc.close();
    }
}
