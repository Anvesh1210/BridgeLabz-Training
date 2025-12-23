//triming a string using buildin method and user define methos and comparing it
import java.util.Scanner;
public class TrimString {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String s) {
        int start = 0;
        int end = s.length() - 1;
        // Trim leading spaces
        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }
        // Trim trailing spaces
        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }
        return new int[] { start, end };
    }

    // Method to create substring using charAt()
    public static String customSubstring(String s, int start, int end) {

        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

		//taking a string from the user
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String customTrimmed = customSubstring(input, indexes[0], indexes[1]);

        String builtInTrimmed = input.trim();

        // Compare both results
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("\nCustom Trimmed String: " + customTrimmed );
        System.out.println("Built-in Trimmed String: " + builtInTrimmed);
        System.out.println("Are both strings equal? " + isSame);
		
		//closing the Scanner
        sc.close();
    }
}
