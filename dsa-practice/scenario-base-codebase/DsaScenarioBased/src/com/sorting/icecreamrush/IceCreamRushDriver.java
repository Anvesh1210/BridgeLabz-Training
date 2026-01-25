package com.sorting.icecreamrush;

//class to use Ice Cream Manager
public class IceCreamRushDriver {
	public static void main(String[] args) {
		IceCream[] iceCreams = { new IceCream("Vanilla", 120), new IceCream("Chocolate", 200),
				new IceCream("Strawberry", 150), new IceCream("Mango", 180), new IceCream("Butterscotch", 90),
				new IceCream("Black Currant", 110), new IceCream("Pista", 95), new IceCream("Coffee", 130) };

		IceCreamManager manager = new IceCreamManager();
		System.out.println("Ice Cream Sales Before Sorting:");
		manager.displayIceCreams(iceCreams);
		manager.bubbleSort(iceCreams);
		System.out.println("\nIce Cream Sales After Sorting (By Popularity):");
		manager.displayIceCreams(iceCreams);
	}
}
