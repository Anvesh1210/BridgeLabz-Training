//compare two strings Lexicographically
import java.util.Scanner;
public class LexicographicalCompare{

    //method to compare two string
    public static int compareStrings(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                return c1 - c2; // difference decides order
            }
        }

        // If all characters are equal so far
        return len1 - len2;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

		//taking two strings from the user
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

		//calling the method to get result
        int result = compareStrings(s1, s2);
		
		//printing the result
        if (result < 0) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
        }

		//closing the Scanner
        sc.close();
    }
}
