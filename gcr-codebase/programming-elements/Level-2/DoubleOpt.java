//writing program for operations on double
import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input values
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // calculating Double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // printing results
        System.out.println("The results of Double Operations are "+ result1 + ", " + result2 + ", " + result3 + ", " + result4);

        input.close();
    }
}
