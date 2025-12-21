//checking a number is positive, Negative or zero
import java.util.Scanner;
public class SmallestAndLargest{

	//method for calculating smallest and largest
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int [] result= new int[2];
		if(number1>number2 && number1>number3){
			result[0]=number1;
		}else if(number2>number1 && number2>number3){
			result[0]=number2;
		}else {
			result[0]=number3;
		}
		
		if(number1<number2 && number1<number3){
			result[1]=number1;
		}else if(number2<number1 && number2<number3){
			result[1]=number2;
		}else {
			result[1]=number3;
		}
		
		return result;
	}
	
	
	public static void main(String []args){
	
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//taking three number from the user
		System.out.print("Enter first Number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second Number: ");
		int number2 = input.nextInt();
		
		System.out.print("Enter third Number: ");
		int number3 = input.nextInt();
		
		//Calling findSmallestAndLargest method
		
		int []result = findSmallestAndLargest(number1, number2, number3);
		
		//printing the smallest and largest number
		System.out.println("Largest: "+result[0]);
		System.out.println("Smallest: "+result[1]);
		
		//closing the scanner
		input.close();
	}
}
