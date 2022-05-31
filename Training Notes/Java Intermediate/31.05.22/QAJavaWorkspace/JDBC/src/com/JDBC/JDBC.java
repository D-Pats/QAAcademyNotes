package com.JDBC;

import java.sql.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/Sakila";
		String username = "root";
		String password = "root";
		String query = "SELECT * FROM actor";

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, username, password);
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);

			while (result.next()) {
				String SakilaData = "";
				for (int i = 1; i <= 4; i++) {
					SakilaData += result.getString(i) + ": ";
				}
				System.out.println(SakilaData);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}

		}
	}
}
