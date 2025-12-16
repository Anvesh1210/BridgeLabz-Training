import java.util.*;
class AverageOfThreeNumbers{
	public static void main(String []args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Three Numbers: ");
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
		double avg = (num1 + num2 + num3)/3.0;
		System.out.println("Avg of given numbers: "+ avg);
	}
}