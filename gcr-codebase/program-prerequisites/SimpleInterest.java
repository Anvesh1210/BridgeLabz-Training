import java.util.*;
class SimpleInterest{
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter principle: ");
		double principle = kb.nextDouble();
		System.out.print("Enter Rate: ");
		double rate = kb.nextDouble();
		System.out.print("Enter Time: ");
		double time = kb.nextDouble();
		System.out.print("Simple Intrest: ");
		double si = (principle*rate*time)/100;
		System.out.println(si);
	}
} 