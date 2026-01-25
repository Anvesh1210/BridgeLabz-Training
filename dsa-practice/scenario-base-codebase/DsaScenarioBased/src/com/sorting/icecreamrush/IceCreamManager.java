package com.sorting.icecreamrush;

//class to sort and display ice cream
public class IceCreamManager {
	// method to perform bubble sort on ice cream
	public void bubbleSort(IceCream[] iceCreams) {
		int n = iceCreams.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {

				if (iceCreams[j].getSoldCount() > iceCreams[j + 1].getSoldCount()) {
					// swap logic
					IceCream temp = iceCreams[j];
					iceCreams[j] = iceCreams[j + 1];
					iceCreams[j + 1] = temp;
				}
			}
		}
	}

	// method to displaying ice cream list
	public void displayIceCreams(IceCream[] iceCreams) {
		for (IceCream iceCream : iceCreams) {
			iceCream.display();
		}
	}
}
