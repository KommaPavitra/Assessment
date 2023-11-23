package com.dl.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg1 {
	static Connection connection = null;
	static Statement createStatement = null;

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jbctest?autoReconnect=true&useSSL=false", "root", "P@vitra12");

			createStatement = connection.createStatement();

			String s1 = "insert into emp(e_no, e_name, e_address, e_contact) values (102, 'SaiKumar', 'Hyd', 9875654321)";
			String s2 = "insert into emp(e_no, e_name, e_address, e_contact) values (103, 'SaiKrishna', 'Hyd', 9875654321)";
			String s3 = "insert into emp(e_no, e_name, e_address, e_contact) values (104, 'SaiVamsi', 'Hyd', 9875654321)";
			String s4 = "insert into emp(e_no, e_name, e_address, e_contact) values (105, 'SaiRam', 'Hyd', 9875654321)";
			String s5 = "insert into emp(e_no, e_name, e_address, e_contact) values (106, 'Abilash', 'Hyd', 9875654321)";
			String s6 = "insert into emp(e_no, e_name, e_address, e_contact) values (107, 'Prem', 'Hyd', 9875654321)";

			createStatement.addBatch(s1);
			createStatement.addBatch(s2);
			createStatement.addBatch(s3);
			createStatement.addBatch(s4);
			createStatement.addBatch(s5);
			createStatement.addBatch(s6);

			int[] executeBatch = createStatement.executeBatch();//array type
//for each loop key value type
			for (int i : executeBatch) {
				System.out.println("Multiple Records Inserted: " + i);
			}

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} finally {
			createStatement.close();
			connection.close();
		}
		//when you run program again it will create duplicates to avoid that we use primary key 

		
	}

}
