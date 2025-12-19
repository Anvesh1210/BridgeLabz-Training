//Finding The power of given number using While
import java.util.Scanner;
class PowerOfNumberUsingWhile{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number and its power from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		System.out.print("Input it's Power: ");
		int power = input.nextInt();
		
		//finding the power of number
		if(number>0 && power>0){
			int result = 1;
			int counter=1;
			while(counter<=power){
				result*=number;
				counter++;
			}
			
			//printing the power of number
			System.out.println("Result accroding to number and its power: "+result);
		}else{
			System.out.println("Not A Positive Number or grater then 100");
		}
		
		//closing the Scanner
		input.close();
	}
}