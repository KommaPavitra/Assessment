package com.dl.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg1 {
	static Connection connection  = null;
	static Statement statement = null;
public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbctest?autoReconnect=true&useSSL=false", "root", "P@vitra12");
			
			statement = connection.createStatement();
			
			String query = "select * from emp";
			
			ResultSet executeQuery = statement.executeQuery(query);
			while (executeQuery.next()) {
				System.out.println(executeQuery.getInt(1));
				System.out.println(executeQuery.getString(2));
				System.out.println(executeQuery.getString(3));
				System.out.println(executeQuery.getLong(4));
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		finally {
			statement.close();
			connection.close();
		}

	}

}
