package com.csvdatahandling;

import java.io.*;
import java.sql.*;

//class for DB to CSV
public class DBToCSV {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/company";
		String user = "root";
		String pass = "root";
		String csvFile = "employees_report.csv";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM employees");
			FileWriter writer = new FileWriter(csvFile);
			// Write CSV header
			writer.append("Employee ID,Name,Department,Salary\n");
			// Write records
			while (rs.next()) {
				writer.append(rs.getInt("id") + ",").append(rs.getString("name") + ",")
						.append(rs.getString("department") + ",").append(rs.getInt("salary") + "\n");
			}
			writer.close();
			con.close();
			System.out.println("CSV report generated successfully!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
