package com.kabira.webp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Service Layer Component

@WebServlet("/cardverify") // URL pattern of class .. where we defining URL it should always start with /
public class CreditCardCheck extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse respose) throws ServletException {
		String name = req.getParameter("CardHolderName");
		String cardnum = req.getParameter("CardNum");
		String exparyDate = req.getParameter("ExparyDate");
		String pin = req.getParameter("Pin");
		System.out.println("Data Receved From Clinet Bolte  ");

		System.out.println("Card Holder Name: " + name);
		System.out.println("Card Number: " + cardnum);
		System.out.println("Expiry Date: " + exparyDate);
		System.out.println("PIN: " + pin);

		Card cardobj = new Card(name, cardnum, exparyDate, pin);
		CardVerification ref = new CardVerification();
		boolean isVerified = ref.verify(cardobj);

		PrintWriter out; // Class to write data in response object 

		try {
			out = respose.getWriter();  // // Method to write data in response object 
			out.println("Data Recived");

			// TODO Auto-generated catch block

			if (isVerified == true) {
				out.println("Card Is Verified ");
				RequestDispatcher rd =  req.getRequestDispatcher("history");
				rd.forward(req, respose);
//				respose.sendRedirect("home.html");
				
			} else {
				out.println("Card Not Verified ");
				respose.sendRedirect("errorpage.html");

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
