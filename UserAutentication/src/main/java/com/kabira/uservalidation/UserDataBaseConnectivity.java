package com.kabira.uservalidation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDataBaseConnectivity implements Connectivity
{

	@Override
	public boolean isValid(User ref) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata","root","beliver012");

			String query = "select * from userinfo where userid = ? and userpass= ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, ref.userID);
			pstmt.setString(2, ref.userPass);
			
			ResultSet res = pstmt.executeQuery();
			
			return res.next();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

}
