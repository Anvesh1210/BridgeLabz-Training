package com.browserbuddy;

import java.util.Stack;

//Browser Buddy application
public class BrowserBuddy {
	private Stack<Tab> closedTabs;
	private Tab activeTab;

	//constructor
	public BrowserBuddy() {
		closedTabs = new Stack<>();
		activeTab = new Tab();
	}

	//getter method to get Active Tab
	public Tab getActiveTab() {
		return activeTab;
	}

	//method to close current tab
	public void closeTab() {
		closedTabs.push(activeTab);
		activeTab = new Tab(); // new empty tab
		System.out.println("Tab closed.");
	}

	//method to restore recently closed tab
	public void restoreTab() {
		if (!closedTabs.isEmpty()) {
			activeTab = closedTabs.pop();
			System.out.println("Tab restored.");
		} else {
			System.out.println("No closed tabs to restore.");
		}
	}
}
