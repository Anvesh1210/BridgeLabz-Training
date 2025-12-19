//finding even and odd number
import java.util.Scanner;
public class FindEvenOdd{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		// Taking a number form user
		System.out.println("Enter a number:");
		int number = input.nextInt();
		
		int []even =new int[number];
		int []odd =new int[number];
		int evenIndex=0;
		int oddIndex=0;
		
		//finding even and odd
		for(int i=1;i<=number;i++){
			
			if(i%2==0){
				even[evenIndex]= i;
				evenIndex++;
			}else{
				odd[oddIndex] = i;
				oddIndex++;
			}
		}
			evenIndex=evenIndex-1;;
			oddIndex=oddIndex-1;;
				
		//printing even and off array
		System.out.println("Even array:");
		while(evenIndex>=0){
			System.out.println(even[evenIndex]);
			evenIndex--;
		}
		System.out.println();
		System.out.println("odd array:");
		while(oddIndex>=0){
			System.out.println(odd[oddIndex]);
			oddIndex--;
		}
		
		//Closing the Scanner 
		input.close();
	}
}
			