//Making a basic Calculator
import java.util.Scanner;
public class BasicCalculator{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking two numbers and operation
		System.out.print("Enter first Number: ");
		double first = input.nextDouble();
		System.out.print("Enter second Number: ");
		double second = input.nextDouble();
		System.out.print("Enter Operation: ");
		String op = input.next();
		
		//perforing operation on the numers and printing it
		switch(op){
			case "+":
				System.out.println("The Addition of given numbers is: "+(first+second));
				break;
			
			case "-":
				System.out.println("The Subtraction of given numbers is: "+(first-second));
				break;
				
			case "*":
				System.out.println("The Multiplication of given numbers is: "+(first*second));
				break;
				
			case "/":
				System.out.println("The Division of given numbers is: "+(first/second));
				break;
				
			default:
				System.out.println("Invalid Operation");
				break;
				
			}
			
			//closing the Scanner
			input.close();
		
	}
}
		