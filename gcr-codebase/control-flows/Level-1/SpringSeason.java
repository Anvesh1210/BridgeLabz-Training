//Check the given month and date is a Spring Season or not
public class SpringSeason{
	public static void main(String []args){
		
		//Parsing the user input
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		
		//checking its a spring season or not and printing it 
		if((month==3 && day>=20  && day<=31) ||
			(month==4 && day>=1 && day<=30) ||
			(month==5 && day>=1 && day<=31) ||
			(month==6 && day>=1 && day<=20)
		){
			System.out.println("Its a Spring Season");
		}else {
			System.out.println("Not a Spring Season");
		}
		
	}
}