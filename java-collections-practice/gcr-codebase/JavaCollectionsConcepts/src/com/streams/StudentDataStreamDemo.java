package com.streams;

import java.io.*;

public class StudentDataStreamDemo {
	public static void main(String[] args) {
		String fileName = "student.dat";
		// Writing Data
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(fileName));
			dos.writeInt(101);
			dos.writeUTF("Anvesh");
			dos.writeDouble(8.75);
			System.out.println("Student data written successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null)
					dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// Reading Data
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream(fileName));
			int rollNo = dis.readInt();
			String name = dis.readUTF();
			double gpa = dis.readDouble();
			System.out.println("\nStudent Details:");
			System.out.println("Roll Number: " + rollNo);
			System.out.println("Name       : " + name);
			System.out.println("GPA        : " + gpa);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
