package com.artifyapplication;

public class PrintArt extends Artwork{
	public PrintArt(String title, String artiest, double price) {
		super(title, artiest, price);
	}
	
	//method to give license to artwork
	@Override
	public void license() {
		System.out.println("Giving Licence to the art: "+title);
		licenseType = "Printing License";
		System.out.println("License Recived: "+licenseType);
	}
}
