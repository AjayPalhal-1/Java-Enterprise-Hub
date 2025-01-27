package com.kabira.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseConnectivity implements Connectivity {

	public Connection connectDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coins", "root", "beliver012");
			System.out.println("Connection Did Succesfully......!");
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public boolean addCoins(Coin coinref) throws SQLException {
		Connection connection = this.connectDatabase();
		String query = "insert into coininfo (country , denomination, yearOfMinitin , currentValue , acquireDate ) values(?,?,?,?,?)";

		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setString(1, coinref.acquiredDate);
		pstmt.setString(2, coinref.cuntryName);
		pstmt.setString(3, coinref.denomination);
		pstmt.setString(4, coinref.yearOfMinting);
		pstmt.setString(5, coinref.currentValue);
		
		if( pstmt.executeUpdate()>0)
		{
			return true ;
		}
		else
		{
			return false ;
			
		}
			

		

	}

	@Override
	public void removeCoins() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showCoins() {
		// TODO Auto-generated method stub

	}

}
