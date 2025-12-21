//Check the given month and date is a Spring Season or not using methods

public class SpringSeason{

	//method for checking the spring season
	public String checkSpringSeason(int month, int day){
		if((month==3 && day>=20  && day<=31) ||
			(month==4 && day>=1 && day<=30) ||
			(month==5 && day>=1 && day<=31) ||
			(month==6 && day>=1 && day<=20)
		){
			return "Spring Season";
		}else {
			return "Not a Spring Season";
		}
	}
	
	
	public static void main(String []args){
		
		//Parsing the user input
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
	
		//creating object of SpringSeason and calling method
		SpringSeason springSeason = new SpringSeason();
		String result = springSeason.checkSpringSeason(month, day);

		// printing its a spring season or not
		System.out.println(result);
		
		
		
	}
}
