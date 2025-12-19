//Sum Of numbers until enter 0
import java.util.Scanner;
public class SumOfNumber{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking number in loop by user and calculating total
		double number = input.nextInt();
		double total=0.0;
		while(number!=0){
			total+=number;
			number = input.nextInt();
		}
		
		//printing the total of numbers
		System.out.println("Total: "+total);
		
		//closing the scanner
		input.close();
		
	}
}