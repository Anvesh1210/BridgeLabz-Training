package com.artifyapplication;

public class DigitalArt extends Artwork{
	
	public DigitalArt(String title, String artiest, double price) {
		super(title, artiest, price);
	}

	@Override
	public void license() {
		System.out.println("Giving Licence to the art: "+title);
		licenseType = "Commercial License";
		System.out.println("License Recived: "+licenseType);
	}
	
	
}
