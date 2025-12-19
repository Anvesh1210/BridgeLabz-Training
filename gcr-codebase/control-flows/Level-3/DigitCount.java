//Counting the digits of given number
import java.util.Scanner;
public class DigitCount{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from user
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		
		//counting the digits of the number
		int count =0;
		int temp=number;
		while(temp!=0){
			temp/=10;
			count++;
		}
		
		//priting the no of digits of number
			System.out.println("The no of digits of given no is "+count);
		
		//closing the Scanner
		input.close();
	}
}
		