//finding shortest and longest word into a given string
import java.util.Scanner;
public class ShortestLongestWord {

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

    // Method to find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] data) {

        int minIndex = 0;
        int maxIndex = 0;

        int minLength = Integer.parseInt(data[0][1]);
        int maxLength = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {
            int currentLength = Integer.parseInt(data[i][1]);
            if (currentLength < minLength) {
                minLength = currentLength;
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = i;
            }
        }

        return new int[] { minIndex, maxIndex };
    }

    public static void main(String[] args) {
		//creating String object
        Scanner sc = new Scanner(System.in);

		//enter a string
        System.out.print("Enter the text: ");
        String input = sc.nextLine();

		//calling the method to split and get length of strings
        String[] words = customSplit(input);
        String[][] wordLengthData = wordLength2D(words);

		//calling method to find shprtest and longest words
        int[] result = findShortestAndLongest(wordLengthData);
		
		//printing the results 
        System.out.println("\nShortest Word: " + wordLengthData[result[0]][0]);
        System.out.println("Length: " + wordLengthData[result[0]][1]);

        System.out.println("\nLongest Word: " + wordLengthData[result[1]][0]);
        System.out.println("Length: " + wordLengthData[result[1]][1]);

		//closing the Scanner object
        sc.close();
    }
}
