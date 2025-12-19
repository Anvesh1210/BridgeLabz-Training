//Finding gratest Factor using While
import java.util.Scanner;
class GratestFactorUsingWhile{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//finding gratest Factor
		if(number>0){
			int gratestFactor=1;
			int counter = number-1;
			while(counter>=1){
				if(number%counter == 0){
					gratestFactor = counter;
					break;
				}
				counter--;
			}
			
			//printing the gratest factor
			System.out.println("Gratest Factor Of given Number is: "+gratestFactor);
		}else{
			System.out.println("Not A Positive Number");
		}
		
		//closing the Scanner
		input.close();
	}
}