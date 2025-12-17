// Finding profit and Loss
public class ProfitAndLoss
{
	public static void main(String[] args)
	{

		//Giving input Details
		int costPrice = 129;
		int sellingPrice = 191;

		//Calculating profit and profit Persentage
		int profit= sellingPrice-costPrice;
		double profitPercentage = (profit/(double)costPrice)*100.0;

		//displaying details
		System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice +"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);

		
	}
}