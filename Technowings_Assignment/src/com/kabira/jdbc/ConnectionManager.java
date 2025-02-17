package com.kabira.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {

	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");

			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TechnoWings_Training", "root",
					"beliver012");
			System.out.println("connection sucess....");
//			return con;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

	public static void closeConnection(Connection con) {
		try {
			con.close();
			System.out.println("Connection Closed ...!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static  void  executeQuery(String query,Connection con) {
		try {
			
			Statement stmt =  con.createStatement();
			stmt.execute(query);
			System.out.println("Query Executed ........!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public int executeUpdate(String sql,Connection c) {
		int rowUpdated = 0;
		try {
			Statement stmt = c.createStatement();
			rowUpdated = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowUpdated;
	}

	public static void main(String[] args) {
		Connection con = getConnection();
		String query = "select * from useraccount";
		executeQuery(query,con);
//		executeUpdate();
		closeConnection(con);
	}

}
