//finding most frequent character in a String
import java.util.Scanner;
public class MostFrequentCharacter{
    //method to find most frequent character in a String
    public static char findMostFrequentChar(String str) {
        str = str.toLowerCase(); 
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        int max = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] > max){
                max = freq[i];
                mostFrequent = (char)i;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking a String from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

		//calling the method to find the most frequent character
        char result = findMostFrequentChar(input);
	
		//printing the result
        System.out.println("Most Frequent Character: '" + result + "'");

		//closing the Scanner
        sc.close();
    }
}
