//removing duplicate from a String
import java.util.Scanner;
public class RemoveDuplicates {
    //method to remove duplicate from a String
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if character already exists in result
            if (result.indexOf(currentChar) == -1) {
                result = result + currentChar;
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
	
		//calling the method
        String output = removeDuplicates(input);

		//printing the result
        System.out.println("String after removing duplicates: " + output);

		//closing the Scanner
        sc.close();
    }
}
