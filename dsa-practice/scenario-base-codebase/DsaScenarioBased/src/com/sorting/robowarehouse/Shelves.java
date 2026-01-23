package com.sorting.robowarehouse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shelves {
	
	private List<Package> packageList;
	
	public Shelves() {
		this.packageList = new ArrayList<>();
	}
	
	private void insertionSort() {
		int i = packageList.size()-1;
		while(i>0 && packageList.get(i).getWeight() < packageList.get(i-1).getWeight()) {
			Package temp = packageList.get(i);
			packageList.set(i, packageList.get(i-1));
			packageList.set(i-1, temp);
			i--;
		}
	}
	
	public void add(Package item) {
		packageList.add(item);
		insertionSort();
	}
	
	public void displayAllPackage() {
		for(Package p : packageList) {
			System.out.println(p);
		}
	}
}
