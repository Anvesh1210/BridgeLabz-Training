//removing a character from the string
import java.util.Scanner;
public class RemoveCharacter {

    //method to remove a character from the String
    public static String removeCharacter(String str, char chToRemove) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != chToRemove) {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking a String and a character from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

		//calling the method and printing the result
        String modified = removeCharacter(input, ch);
        System.out.println("Modified String: " + modified);

		//closing the Scanner object
        sc.close();
    }
}
