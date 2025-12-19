//check whether a number is positive, negative, or zero
import java.util.Scanner;
public class CheckNumber{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//checking the number is positive, negative or zero
		if(number>0){
			System.out.print("Positive");
		}else if(number<0){
			System.out.print("Negative");
		}else{
			System.out.print("Zero");
		}
		
		//closing the Scanner
		input.close();
	}
}
		