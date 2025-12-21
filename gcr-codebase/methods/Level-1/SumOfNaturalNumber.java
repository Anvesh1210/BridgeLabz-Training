//checking a number is positive, Negative or zero
import java.util.Scanner;
public class SumOfNaturalNumber{

	//method for calculating sum of natural number
	public int getSumOfNaturalNumbers(int number){
		int sum=0;
		while(number>0){
			sum+=number;
			number--;
		}
		return sum;
	}
	
	
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//taking a number form the user
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		
		//creating object of SumOfNaturalNumber and calling getSumOfNaturalNumbers
		SumOfNaturalNumber naturalNumber= new SumOfNaturalNumber();
		int sum = naturalNumber.getSumOfNaturalNumbers(number);
		
		//printing the sum
		System.out.println("The sum of "+number+" natural numbers is "+sum);
		
		//closing the scanner
		input.close();
	}
}
