//check for the natural number and write the sum of n natural numbers
import java.util.Scanner;
public class NaturalNumSumUsingLoop{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//Checking number is Nautral 
		if(number > 0){
			
			//Calulating the sum of Natural numbers and printing it
			int sumUsingFormula	= (number*(number+1))/2;
			int i=number;
			int sumUsingLoop = 0;
			while(i>0){
				sumUsingLoop+=i;
				i--;
			}
			
			System.out.println("The sum of "+number+" natural numbers using formula is "+sumUsingFormula+" And using Loop "+sumUsingLoop);
			
		}else{
			System.out.println("The number "+number+" is not a natural number");
		}
		
		//closing the Scanner
		input.close();
	}
}