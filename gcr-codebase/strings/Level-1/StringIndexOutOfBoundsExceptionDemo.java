//generate StringOutOfBoundException
public class StringIndexOutOfBoundsExceptionDemo {
    // Method to generate StringIndexOutOfBoundsException
    static void generateException(String s) {
        s.charAt(s.length());
    }

    // Method to handle NullPointerException
    static void handleException(String s) {          
        try {
            generateException("hello");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("NullPointerException caught and handled");
        }
    }

    public static void main(String[] args) {

        //Calling method that generates exception
        System.out.println("Generating Exception:");


        //Refactored code to handle RuntimeException
        System.out.println("Handling Exception:");
        handleException("hello");
    }
}
