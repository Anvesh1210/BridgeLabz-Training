//program Quadratic to find the roots of the equation ax2+ bx + c. 
import java.util.Scanner;
public class Quadratic {
    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // calculate delta 
        double delta = Math.pow(b, 2) - 4 * a * c;

        // if delta is positive then finding two roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta))/(2*a);
            double root2 = (-b - Math.sqrt(delta))/(2*a);
            return new double[]{root1, root2};
        }
        // if delta is zero → one root
        else if(delta == 0){
            double root = -b / (2 * a);
            return new double[]{root};
        }else{
            return new double[0]; 
        }
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking input values
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Calling findRoots method to find roots
        double[] roots = findRoots(a, b, c);

        // Displaying result
        if (roots.length == 2) {
            System.out.println("Two roots are:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One root is:");
            System.out.println("Root = " + roots[0]);
        } else {
            System.out.println("No real roots");
        }

		//closing the scanner
        input.close();
    }
}
