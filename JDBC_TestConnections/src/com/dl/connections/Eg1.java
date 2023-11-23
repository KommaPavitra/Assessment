package com.dl.connections;

public class Eg1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver Connected");

		} catch (ClassNotFoundException e) {
			System.out.println("Catch: " + e);
		}
	}

}
