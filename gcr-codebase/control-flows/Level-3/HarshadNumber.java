//Cheking the given number is Harshad or not
import java.util.Scanner;
public class HarshadNumber{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from user
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		
		//checking the number is Harshad or not
		int sum=0;
		int temp=number;
		while(temp!=0){
			int n = temp%10;
			sum+=n;
			temp/=10;
		}
		
		//priting that it is harshad number or not
		if(number%sum==0){
			System.out.println("Given number is a Harshad number");
		}else{
			System.out.println("Given number is not a Harshad number");
		}
		
		//closing the Scanner
		input.close();
	}
}
		