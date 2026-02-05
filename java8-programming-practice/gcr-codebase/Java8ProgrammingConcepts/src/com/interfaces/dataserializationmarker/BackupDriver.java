package com.interfaces.dataserializationmarker;

public class BackupDriver {
	public static void main(String[] args) {
		UserData data = new UserData();
		// Checking marker interface at runtime
		if (data instanceof BackupMarker) {
			System.out.println("Object is eligible for backup");
		} else {
			System.out.println("Object is NOT eligible for backup");
		}
	}
}
