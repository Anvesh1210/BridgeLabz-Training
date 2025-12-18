//writing program for operations on integer
import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input values
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //calculating Integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        //printing results
        System.out.println("The results of Int Operations are "+ result1 + ", "+ result2 + ", "+ result3 + ", "+ result4);

        input.close();
    }
}
