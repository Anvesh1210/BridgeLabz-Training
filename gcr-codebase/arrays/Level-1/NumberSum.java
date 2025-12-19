//Sum of numbers until enters 0 or negative number
import java.util.Scanner;
public class NumberSum{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		int []numbers = new int[10];
		int sum=0;

		// Taking numbers from user until 0 and adding them
		System.out.println("Enter numbers:");
		for(int i=0;i<numbers.length;i++){
			numbers[i] = input.nextInt();
			sum+=numbers[i];
			
			if(numbers[i]<=0){
				break;
			}
		}
		
		System.out.println("The Sum of given numbers is :"+sum);
		
		//Closing the Scanner 
		input.close();
	}
}
			