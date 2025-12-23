import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length of string without using length()
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Method to find unique characters and return 1D array
    public static char[] findUniqueChars(String s) {
        int len = findLength(s);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = s.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (current == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create new array with exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    
    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
			
        char[] result = findUniqueChars(input);
		
		//printing unique characters
        System.out.println("Unique characters are:");
        for (char c : result) {
            System.out.print(c + " ");
        }

		//closing Scanner object
        sc.close();
    }
}
