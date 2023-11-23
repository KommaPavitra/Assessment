package com.dl.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg1 {
	//create table
	static Connection connection = null;
	static Statement createStatement = null;

	public static void main(String[] args) throws SQLException {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbctest?autoReconnect=true&useSSL=false", "root", "P@vitra12");
			//create statement
			 createStatement = connection.createStatement();
			String query="create table emp(e_no int, e_name varchar(40), e_address varchar(255), e_contact double)";
			// Step 4 Execute the query
			int executeUpdate = createStatement.executeUpdate(query);

			System.out.println("Table Created: " + executeUpdate);


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//closing connections
		finally {
			createStatement.close();
			connection.close();
		}
	}
//output Table created :0
//connections should close in finally->error->create properties globally we can access them using reference.

}
