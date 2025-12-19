//finding Factors of a number
import java.util.Scanner;
public class FindFactors{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		// Taking a number form user
		System.out.println("Enter a number:");
		int number = input.nextInt();
		
		int maxFactors=10;
		int [] factors=new int[maxFactors];
		int index=0;
		
		for(int i=1;i<=number;i++){
			if(number%i==0){
				if(index<maxFactors){
					factors[index]=i;
					index++;
				}else{
					int[] temp=factors;
					maxFactors*=2;
					factors=new int[maxFactors];
					for(int j=0;j<temp.length;j++){
						factors[j]=temp[j];
					}
					factors[index]=i;
					index++;
				}
			}
		}
		
		//printing the factors
		for(int k=0;k<factors.length;k++){
			if(factors[k]==0){
				break;
			}
			System.out.println(factors[k]);
		}
		
		//Closing the Scanner 
		input.close();
		
	}
}
			