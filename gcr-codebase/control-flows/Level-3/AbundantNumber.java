//Cheking the given number is Abundant  or not
import java.util.Scanner;
public class AbundantNumber{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from user
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		
		//checking the number is Abundant or not
		int sum=0;
		for(int i=1;i<number;i++){
			if(number%i==0){
				sum+=i;
			}
		}
		//priting that it is Abundant number or not
		if(number < sum){
			System.out.println("Given number is a Abundant number");
		}else{
			System.out.println("Given number is not a Abundant number");
		}
		
		//closing the Scanner
		input.close();
	}
}
		