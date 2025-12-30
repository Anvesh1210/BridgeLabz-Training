//Temprature Logger
import java.util.Scanner;
public class TempratureLogger{
	public static void main(String []args){
		
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n==================================");
		System.out.println("   Welcome to Temprature Logger   ");
		System.out.println("==================================");
		
		System.out.println("\n\nEnter Temprature of last 7 days");
		System.out.println("-------------------------------------");
		
		double []temprature = new double[7];
		double maxTemp = 0;
		double totalTemp = 0;
		
		//taking last 7 day temprature and find max temprature
		for(int i=0;i<temprature.length;i++){
			System.out.print("Enter temprature of day "+(i+1)+": ");
			temprature[i] = input.nextDouble();
			totalTemp+=temprature[i];
			if(maxTemp<temprature[i]){
				maxTemp = temprature[i];
			}
		}
		
		//printing the output
		System.out.println("\n-------------------------------------");
		System.out.println("The Avg temprature of last 7 days      : "+(totalTemp/7.0));
		System.out.println("The maximum temprature of last 7 days  : "+(maxTemp));
		System.out.println("Thankyou for using the application!");
		System.out.println("-------------------------------------");
		
		//closing the Scanner
		input.close();
	}
}