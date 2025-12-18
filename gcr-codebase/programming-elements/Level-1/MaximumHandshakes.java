//Finding maximum number of handshake 
import java.util.Scanner;
class MaximumHandshakes{
	public static void main(String [] args){
		
		//Taking number of Student
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();
		
		//calculating possible number of handshakes
		int maxHandShakes = (numberOfStudents*(numberOfStudents-1))/2;
		
		//printing maximum handshakes
		System.out.println("Possible number of maximum Handshakes: "+maxHandShakes);
	}
}