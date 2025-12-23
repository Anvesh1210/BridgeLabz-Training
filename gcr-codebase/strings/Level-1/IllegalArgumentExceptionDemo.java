import java.util.Scanner;
public class IllegalArgumentExceptionDemo {
    // Method to generate IllegalArgumentException 
    static void generateException(String text) {
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException using try catch
    static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } 
        catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call method that generates exception
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception generated and program continued");
        }

        // Call method that handles exception
        handleException(text);

        sc.close();
    }
}
