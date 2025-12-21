//calculate various trigonometric functions using Math class
import java.util.Scanner;
public class TrigonometricFunctions{

	//method for calculating Remainder And Quotient
	public double[] calculateTrigonometricFunctions(double angle){
		double []functions =new double[3];
		functions[0] = Math.sin(angle);
		functions[1] = Math.cos(angle);
		functions[2] = Math.tan(angle);
		
		return functions;
	}
	
	
	public static void main(String []args){
	
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//taking angle from the user
		System.out.print("Enter Angle: ");
		double angle = input.nextDouble();
		
		//creating object of TrigonometricFunctions
		TrigonometricFunctions trigonometricFunctions =new TrigonometricFunctions();
		
		//Calling calculateTrigonometricFunctions method
		double []functions = trigonometricFunctions.calculateTrigonometricFunctions(angle);
		
		//printing the Trigonometric Functions 
		System.out.println("sin("+angle+") :"+ functions[0]);
		System.out.println("cos("+angle+") :"+ functions[1]);
		System.out.println("tan("+angle+") :"+ functions[2]);
		
		//closing the scanner
		input.close();
	}
}
