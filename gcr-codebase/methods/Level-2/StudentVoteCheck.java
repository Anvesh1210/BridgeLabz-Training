//checking for student can vote or not
import java.util.Scanner;
class StudentVoteCheck{

	//method for checking that student can vote or not
	public boolean canStudentVote(int age){
		if(age<=0){
		 return false;
		}
		
		if(age<18){
			return false;
		}else{
			return true;
		}
	}
	
	
	public static void main(String []args){
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//taking student ages from the user
		int [] ages= new int[10];
		for(int i=0;i<10;i++){
			System.out.print("Enter student no "+(i+1)+" age:");
			ages[i] = input.nextInt();
		}
		
		//creting object of StudentVoteCheck class
		StudentVoteCheck studentVoteCheck = new StudentVoteCheck();
		
		//checking student can vote or not by calling the method canStudentVote() into loop
		for(int i=0;i<10;i++){
			boolean canVote = studentVoteCheck.canStudentVote(ages[i]);
			if(canVote){
				System.out.println("Student "+(i+1)+" can vote.");
			}else{
				System.out.println("Student "+(i+1)+" can not vote.");
			}
		}
		
		//closing the scanner
		input.close();
	}
}