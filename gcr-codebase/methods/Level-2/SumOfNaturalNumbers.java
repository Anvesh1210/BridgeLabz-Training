//Finding sum of n natural number using recursion
import java.util.Scanner;	
class SumOfNaturalNumbers{

	//method for finding the natural number sum using rescursion
	public static int sumUsingRecursion(int number){
		if(number<=0){
			return 0;
		}
		return number+sumUsingRecursion(number-1);
	}
	
	public static int sumUsingFormula(int number){
		int sum = (number*(number+1))/2;
		return sum;
	}
	
	public static void main(String[] args){
	
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//taking a number from the user
		System.out.print("Enter a natural number: ");
		int number = input.nextInt();
		
		//checking the number is natural number is not 
		if(number>0){
		
			//calling the function sumUsingRecursion and sumUsingFormula
			int recursionSum = sumUsingRecursion(number);
			int formulaSum = sumUsingFormula(number);
			System.out.println("The sum using recursion is "+recursionSum);
			System.out.println("The sum using formula is "+formulaSum);
		}else{
			System.out.println("Number is not a natural number");
		}
		
		//closing the Scanner 
		input.close();
	}
}