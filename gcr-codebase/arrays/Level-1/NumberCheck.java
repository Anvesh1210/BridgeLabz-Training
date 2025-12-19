//Checking wheter a number is positive, even or odd and compare first and last
import java.util.Scanner;
public class NumberCheck{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		// Taking 5 numbers from user
		int []numbers = new int[5];
		System.out.println("Enter 5 numbers:");
		for(int i=0;i<numbers.length;i++){
			numbers[i] = input.nextInt();
		}
		
		//checking number is positive or negative or zero
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]>0){
				
				//checking the number is even or odd
				if(numbers[i]%2==0){
					System.out.println("The number "+numbers[i]+" is posative and even");
				}else{
					System.out.println("The number "+numbers[i]+" is posative and odd");
				}
				
			}else if(numbers[i]<0){
				System.out.println("Negative");
			}else{
				System.out.println("Zero");
			}
		}
		
		//comparing first and last number of array
		if(numbers[0]>numbers[numbers.length-1]){
			System.out.println("First is Grater then last");
		}else if(numbers[0]<numbers[numbers.length-1]){
			System.out.println("First is lesser then last");
		}else{
			System.out.println("First and last are equal");
		}
		
		//Closing the Scanner 
		input.close();
	}
}
			