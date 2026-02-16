package com.transactionmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	private static final String URL = "jdbc:mysql://localhost:3306/mysql_practice";
    private static final String USER = "root";
    private static final String PASSWORD = "Anvesh2005";

    public static Connection getConnection() {
        try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println("Exception in opening connection: "+e.getMessage());
		}
        return null;
    }
}
