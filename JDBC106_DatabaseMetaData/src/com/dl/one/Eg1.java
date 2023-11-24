package com.dl.one;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Eg1 {
	//Database Metadata:DriverName,Driver Version,User name,DB Product Name,DB Product Version 8.0.11
     static Connection con =null;
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbctest?autoReconnect=true&useSSL=false", "root", "P@vitra12");
			 DatabaseMetaData dbmd = con.getMetaData();
			 System.out.println("Driver Name..."+dbmd.getDriverName()); 
			 System.out.println("Driver Version....."+dbmd.getDriverVersion());
			 System.out.println("UserName....."+dbmd.getUserName());
			 System.out.println("Database Product Name.."+dbmd.getDatabaseProductName());
			 System.out.println("Database product Version.."+dbmd.getDatabaseProductVersion());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		
	}

}
//output:
//Driver Name...MySQL Connector/J
//Driver Version.....mysql-connector-java-8.0.11 (Revision: 6d4eaa273bc181b4cf1c8ad0821a2227f116fedf)
//UserName.....root@localhost
//Database Product Name..MySQL
//Database product Version..8.0.34
