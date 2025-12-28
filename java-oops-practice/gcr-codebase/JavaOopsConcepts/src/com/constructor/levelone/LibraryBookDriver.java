package com.constructor.levelone;

//class to use LibraryBookClass
public class LibraryBookDriver {
	 public static void main(String[] args) {
		 	
		 //creating LibraryBook object
	     LibraryBook b1 = new LibraryBook("101", "Effective Java", "Joshua Bloch");
	     
	     //calling method to display details
	     b1.displayBook();

	     System.out.println();
	     
	     //creating EBook Object
	     EBook eb1 = new EBook("101","Head First Java","Kathy Sierra",5.4);
	     
	     //Displaying EBook details
	     eb1.displayEBook();

	     // Modify author using setter
	     eb1.setAuthor("Kathy Sierra & Bert Bates");
	     System.out.println("\nAfter updating author:");
	     eb1.displayEBook();
	    }
}
