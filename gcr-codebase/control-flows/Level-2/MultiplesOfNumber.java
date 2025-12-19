//Finding All multiples Of a number
import java.util.Scanner;
class MultiplesOfNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//finding All multiples and printing it
		if(number>0 && number<100){
			System.out.println("Multiples of given number is: ");
			for(int i=number;i>=1;i--){
				if(number%i == 0){
					System.out.println(i);
				}
			}
		}else{
			System.out.println("Not A Positive Number or grater then 100");
		}
		
		//closing the Scanner
		input.close();
	}
}