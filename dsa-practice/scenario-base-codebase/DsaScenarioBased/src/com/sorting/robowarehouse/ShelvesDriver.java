package com.sorting.robowarehouse;

public class ShelvesDriver {
	public static void main(String[] args) {
		Shelves shelve = new Shelves();
		Package package1 = new Package(50);
		Package package2 = new Package(45);
		Package package3 = new Package(70);
		Package package4 = new Package(25);
		Package package5 = new Package(75);
		
		shelve.add(package1);
		shelve.add(package2);
		shelve.add(package3);
		shelve.add(package4);
		shelve.add(package5);
		
		shelve.displayAllPackage();
	}
}
