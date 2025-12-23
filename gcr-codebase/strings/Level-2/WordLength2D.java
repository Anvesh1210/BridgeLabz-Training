//spliting strings into words and finding each word length
import java.util.Scanner;
public class WordLength2D {

    // Method to find string length without using length()
    public static int getStringLength(String s){
		int count =0;
		try{
			while(true){
				s.charAt(count);
				count++;
			}
		}catch(StringIndexOutOfBoundsException ex){
			
		}
		return count;
	}

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {
        int length = getStringLength(text);
        int wordCount = 1;

        // Count words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
		
        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        words[wordCount - 1] = text.substring(start);
        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] wordLength2D(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
		//creating STring object
        Scanner sc = new Scanner(System.in);

		//Taking a line of string from user
        System.out.print("Enter the text: ");
        String input = sc.nextLine();

		//calling the methods
        String[] words = customSplit(input);
        String[][] wordWithLength = wordLength2D(words);

		//showing thw result in tablur format
        System.out.println("\nWord\tLength");
        System.out.println("---------------");

        for (int i = 0; i < wordWithLength.length; i++) {
            int len = Integer.parseInt(wordWithLength[i][1]);
            System.out.println(wordWithLength[i][0] + "\t" + len);
        }
	
		//closing the Scanner
        sc.close();
    }
}
