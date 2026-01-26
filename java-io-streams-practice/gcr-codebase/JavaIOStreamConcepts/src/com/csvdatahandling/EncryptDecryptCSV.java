package com.csvdatahandling;

import java.io.*;
import java.util.Base64;

public class EncryptDecryptCSV {
	// Encrypt data
	public static String encrypt(String data) {
		return Base64.getEncoder().encodeToString(data.getBytes());
	}
	// Decrypt data
	public static String decrypt(String data) {
		return new String(Base64.getDecoder().decode(data));
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("secure_users.csv"));
		FileWriter writer = new FileWriter("encrypted_users.csv");
		String line;
		writer.write(br.readLine() + "\n");
		while ((line = br.readLine()) != null) {
			String[] data = line.split(",");
			// Encrypt sensitive fields
			data[2] = encrypt(data[2]); 
			data[3] = encrypt(data[3]);
			writer.write(String.join(",", data) + "\n");
		}
		br.close();
		writer.close();
		System.out.println("CSV encrypted successfully!");
	}
}
