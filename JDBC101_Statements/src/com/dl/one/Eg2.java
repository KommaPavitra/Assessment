package com.dl.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Eg2 {
	// Insert Record
		static Connection connection = null;
		static Statement createStatement = null;

	public static void main(String[] args) throws SQLException {
		try {
			// Step 1 Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2 Create the Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbctest?autoReconnect=true&useSSL=false", "root", "P@vitra12");

			// Step 3 Create a Statement
			createStatement = connection.createStatement();

			String query = "insert into emp(e_no, e_name, e_address, e_contact) values (101, 'SaiKiran', 'Hyd', 9875654321)";

			// Step 4 Execute the query
			int executeUpdate = createStatement.executeUpdate(query);

			System.out.println("Record Inserted: " + executeUpdate);

		} catch (ClassNotFoundException e) {

			System.out.println(e);

		} finally {

			// Step 5 Closing the Connection
			createStatement.close();
			connection.close();
		}
		
	}
	//data single colon must

}
