//Convert 2D array into 1D array
import java.util.Scanner;
public class ArrayConversion{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking rows and column
		System.out.print("Enter Rows: ");
		int rows=input.nextInt();
		System.out.print("Enter Column: ");
		int column= input.nextInt();
		
		int [][]array=new int[rows][column];
		//Taking Array elements
		for(int i=0;i<rows;i++){
			System.out.println("Enter row: "+(i+1));
			for(int j=0;j<column;j++){
				array[i][j] = input.nextInt();
			}
		}
		
		//converting it into one dimension array
		int [] newArray = new int[rows*column];
		int index=0;
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<column;j++){
				newArray[index]=array[i][j];
				index++;
			}
		}
		
		//printing the array
		System.out.println("Converted 1d array: ");
		for(int i=0;i<newArray.length;i++){
			System.out.println(newArray[i]);
		}
		
		//closing the scanner
		input.close();
	}
}