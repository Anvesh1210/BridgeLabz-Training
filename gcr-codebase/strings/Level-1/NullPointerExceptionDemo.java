public class NullPointerExceptionDemo {
    // Method to generate NullPointerException
    static void generateException() {
        String text = null;           
        System.out.println(text.length()); 
    }

    // Method to handle NullPointerException
    static void handleException() {
        String text = null;           
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled");
        }
    }

    public static void main(String[] args) {

        //Calling method that generates exception
        System.out.println("Generating Exception:");
        

        //Refactored code to handle RuntimeException
        System.out.println("Handling Exception:");
        handleException();
    }
}
