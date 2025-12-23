//checking the Strings is Anagrams or not
import java.util.Scanner;
import java.util.Arrays;
public class AnagramCheck {
    //method to find given Strings is anagrams or not
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    
    public static void main(String[] args) {
		//Creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking two Strings from the user
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

		//calling the areAnagrams() method and printing the results
        if (areAnagrams(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
		
		//closing the Scanner
        sc.close();
    }
}
