//checking each character in a string that it is vovel or consonant  
import java.util.Scanner;
public class CharacterTypeDemo {

    // Method to check character type
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 65 && ch <= 90) {   // A–Z
            ch = (char)(ch + 32);
        }

        // Check if character is a letter
        if (ch >= 97 && ch <= 122) {  // a–z
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to analyze string and return 2D array
    public static String[][] analyzeString(String s) {
        String[][] result = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            result[i][0] = String.valueOf(s.charAt(i));
            result[i][1] = checkCharType(s.charAt(i));
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data){
        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		//getting a String from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
		
		//calling the method to analyze String
        String[][] result = analyzeString(input);
		
		//displaying the result
        displayResult(result);

        sc.close();
    }
}
