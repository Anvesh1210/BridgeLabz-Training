package com.browserbuddy;

public class BrowserBuddyDriver {
	public static void main(String[] args) {
		
		//creating BrowserBuddy object
		BrowserBuddy browser = new BrowserBuddy();
		//getting active tab
		Tab tab = browser.getActiveTab();

		//visiting sites
		tab.visit("google.com");
		tab.visit("github.com");
		tab.visit("stackoverflow.com");

		//calling methods
		tab.back();
		tab.back();
		tab.forward();

		browser.closeTab();

		browser.restoreTab();
		System.out.println("Current Page: " + browser.getActiveTab().getCurrentPage());
	}
}
