//finding characters frequency using Nasted loop
import java.util.Scanner;
public class CharacterFrequencyNestedLoops {

    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();  
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++){
            freq[i] = 1;
            if (chars[i] == '0')
                continue;

            for (int j = i + 1; j < chars.length; j++){
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        //Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        //Store result in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
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

        String[] frequencyResult = findFrequency(input);

		//priting the results
        System.out.println("\nCharacter Frequency:");
        System.out.println();

        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(frequencyResult[i]);
        }
	
		//closing the scanner
        sc.close();
    }
}
