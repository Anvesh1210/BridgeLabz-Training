//Sum Of numbers until enter 0 or negative
import java.util.Scanner;
public class SumOfPositiveNumber{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking number in loop by user and calculating total
		double total=0.0;
		while(true){
			int number = input.nextInt();
			if(number<=0){
				break;
			}
			total+=number;
		}
		
		//printing the total of numbers
		System.out.println("Total: "+total);
		
		//closing the scanner
		input.close();
		
	}
}