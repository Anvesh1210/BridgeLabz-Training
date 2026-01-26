package com.streams;

import java.io.*;

public class ImageByteArrayDemo {
	public static void main(String[] args) {
		File inputImage = new File("input.jpg");
		File outputImage = new File("output.jpg");
		if (!inputImage.exists()) {
			System.out.println("Image file does not exist.");
			return;
		}
		byte[] imageBytes = null;

		// Convert Image to Byte Array
		try {
			FileInputStream fis = new FileInputStream(inputImage);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[4096];
			int bytesRead;
			while ((bytesRead = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesRead);
			}
			imageBytes = baos.toByteArray();
			fis.close();
			baos.close();
			System.out.println("Image converted to byte array.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Write Byte Array to Image File
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
			FileOutputStream fos = new FileOutputStream(outputImage);
			byte[] buffer = new byte[4096];
			int bytesRead;
			while ((bytesRead = bais.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}
			bais.close();
			fos.close();
			System.out.println("Byte array written back to image file.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// verify Files
		if (inputImage.length() == outputImage.length()) {
			System.out.println("Verification successful: Files are identical.");
		} else {
			System.out.println("Verification failed: Files are different.");
		}
	}
}
