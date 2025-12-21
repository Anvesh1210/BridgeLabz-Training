//finding quotient and reminder of two numbers
import java.util.Scanner;
public class RemainderAndQuotient{

	//method for calculating Remainder And Quotient
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int [] result=new int[2];
		
		//finding reminder
		result[0] = number%divisor;
		
		//finding Quotient
		result[1] = number/divisor;
		
		return result;
	}
	
	
	public static void main(String []args){
	
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//taking two numbers from the user
		System.out.print("Enter Number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter Divisor: ");
		int number2 = input.nextInt();
		
		
		//Calling findRemainderAndQuotient method
		int []result = findRemainderAndQuotient(number1, number2);
		
		//printing the smallest and largest number
		System.out.println("Remainder: "+result[0]);
		System.out.println("Quotient: "+result[1]);
		
		//closing the scanner
		input.close();
	}
}
