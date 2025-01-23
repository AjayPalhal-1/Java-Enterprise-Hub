package com.kabira.webp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConnectivity implements Connectivity {

	public boolean isCardPresent(Card ref) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/creditcard", "root",
					"beliver012");
			String query = "select * from cardinfo where cardnumber=?";

			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, ref.cardnumber);
			ResultSet res = pstmt.executeQuery(); // we can't return res coz its not contain any kind of data its just
													// pointing to the data in database
			
			return res.next(); // res.next return boolean
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block9
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public boolean isValid(Card ref) {

		return isCardPresent(ref);
	}
}
