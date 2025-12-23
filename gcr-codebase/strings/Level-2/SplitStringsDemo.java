//Split the Strings into String Array using build-in method and User define method
import java.util.Scanner;
public class SplitStringsDemo {

    //method to find string length using charAt() method
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
    public static String[] customSplit(String s) {

        int length = getStringLength(s);
        int wordCount = 1;

        // Count number of words
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = s.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }

        words[wordCount - 1] = s.substring(start);
        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		//Taking a String from the user
        System.out.print("Enter the text: ");
        String s = sc.nextLine();

		//calling build in and user define method
        String[] customResult = customSplit(s);
        String[] builtInResult = s.split(" ");

        boolean isSame = compareArrays(customResult, builtInResult);

        System.out.println("Comparison Result: " + isSame);
		
		//closing the Scanner 
        sc.close();
    }
}
