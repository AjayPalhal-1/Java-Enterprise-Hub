package com.kabira.demos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addCoins")
public class AddCoinsServlet extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String contryName = request.getParameter("countryname");
		String denomination = request.getParameter("denomination");
		String yearOfMiniting = request.getParameter("yearOfMiniting");
		String currentValue = request.getParameter("currentvalue");
		String accDate = request.getParameter("Acquiredate");
		Coin coinref = new Coin(contryName, denomination, yearOfMiniting, currentValue, accDate);

		Connectivity dbconnect = new DataBaseConnectivity();
		PrintWriter out = null; // Class to write data in response object
		out = response.getWriter();
		out.println("Hi >>>>>");


		try {
			if (dbconnect.addCoins(coinref)) {
				System.out.println("Data Inserted Succesfully ");
				out.println("Data Inserted Succesfully ");
			} else {
				System.out.println("We Are In Else ");
				out.println("Data  Not Inserted Succesfully ");
				

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
