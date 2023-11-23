package com.dl.connections;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Eg3 {

	public static void main(String[] args) {
		try {
			DriverManager.getConnection("jdbc:mysql://localhost:3306/jbctest?autoReconnect=true&useSSL=false", "root", "P@vitra12");
			System.out.println("Database Connected ");
		} catch (SQLException e) {

			System.out.println("Catch: " + e);
		}
	}

}
