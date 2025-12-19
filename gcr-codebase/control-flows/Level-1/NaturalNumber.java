//check for the natural number and write the sum of n natural numbers
import java.util.Scanner;
public class NaturalNumber{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//Checking number is Nautral 
		if(number > 0){
			
			//Calulating the sum of Natural numbers and printing it
			int sum = (number*(number+1))/2;
			System.out.println("The sum of "+number+" natural numbers is "+sum);
			
		}else{
			System.out.println("The number "+number+" is not a natural number");
		}
		
		//closing the Scanner
		input.close();
	}
}