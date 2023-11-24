package com.dl.one;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//To configure multiple databases at a time
//older concept
//java.util->from collections
public class Eg1 {
	static Connection con=null;
	static Statement st=null;
	
public static void main(String[] args) throws IOException,SQLException{
	//global
	Connection con=null;
	Statement st=null;
	
	//loading file
	
	FileInputStream stream = new FileInputStream("src\\abc.properties");
	
	//get properties
	
	Properties properties = new Properties();
	
	//load file
	properties.load(stream);
	
	//getting properties from file
	String Dclass = properties.getProperty("property.class");
	String Durl= properties.getProperty("property.url");
	String Duser = properties.getProperty("property.username");
	String Dpass = properties.getProperty("property.password");
	try {
	Class.forName(Dclass);
	con = DriverManager.getConnection(Durl,Duser,Dpass);
	st = con.createStatement();
	String s1 ="(create table emp_properties(eid int ,ename varchar(40),lname varchar(40),address varchar(255) salary double)";
	String s2="(insert into emp_properties values(301,'ishan','analyst','cts',22000)";
	int  aa = st.executeUpdate(s2);
	if(aa==1) {
		System.out.println();
		System.out.println("Data Inserted");
	}
	}catch(ClassNotFoundException e){
		e.printStackTrace();
		
	}finally {
		con.close();
		st.close();
	}
	
}
}
