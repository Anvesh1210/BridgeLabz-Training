//Shopkeeper’s Discount Dashboard 
import java.util.Scanner;
public class DiscountDashboard{
	public static void main(String [] args){
		
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//taking number of items from user
		System.out.print("Enter number of items : ");
		int numOfItem = input.nextInt();
		
		double [] prices = new double[numOfItem];
		double totalPrice = 0.0;
		System.out.println();
		//taking price of each item and caclulating total price
		for(int i=0;i<numOfItem;i++){
			System.out.print("Enter price of item "+(i+1)+" : ");
			prices[i]=input.nextDouble();
			totalPrice+=prices[i];
		}
		
		double discount=0;
		if(totalPrice >= 5000){
			discount += (totalPrice*0.10);
		}else if(totalPrice>=3000){
			discount += (totalPrice*.05);
		}else{
			discount=0;
		}
		System.out.println("----------------------------------------------------------------");
		//printing the results
		System.out.println("The toatal amount of your products   :" +totalPrice);
		System.out.println("Discount Applied                     :" +discount);
		System.out.println("Total amount you have to pay         :" +(totalPrice-discount));
		System.out.println("----------------------------------------------------------------");
		
		//closing the Scanner
		input.close();
	}
}