package com.dl.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg1 {
   //Result set metadata :Column Name,Column Size,DataType
   //global
	static  Connection con = null;
	static Statement stm = null;
	
	public static void main(String[] args) throws SQLException  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbctest?autoReconnect=true&useSSL=false", "root", "P@vitra12");
			String s1 ="select *from emp";
		    stm = con.createStatement();
			ResultSet rs = stm.executeQuery(s1);
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			System.out.println("No.of Columns :"+ count);
			System.out.println("********************");
			for(int i=1;i<=count;i++) {
				System.out.println("Column name......." +rsmd.getColumnName(i));
				System.out.println("Data Type......" +rsmd.getColumnTypeName(i));
				System.out.println("Column Size....."+rsmd.getColumnDisplaySize(i));
				System.out.println("******************************");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			con.close();
			stm.close();
			
		}
		 
		//output:
		
	}

}
