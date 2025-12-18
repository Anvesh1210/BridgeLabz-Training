//Finding the total price of Items
import java.util.Scanner;
class TotalPrice
{
	public static void main(String[] args)
	{

	//Taking User Input
	Scanner input = new Scanner(System.in);
	double unitPrice = input.nextDouble();
	double quantity = input.nextDouble();
	
	//calculating total price
	double totalPrice = unitPrice*quantity;
	
	System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}
}

	