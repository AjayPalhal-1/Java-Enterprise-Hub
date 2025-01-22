package com.kabira.webp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cardverify") // URL pattern of class .. where we defining URL it should always start with /
public class CreditCardCheck extends HttpServlet {
	
	public void service (HttpServletRequest req  , HttpServletResponse respose)
	{
		 String name = req.getParameter("CardHolderName");	
		 String  cardnum = req.getParameter("CardNum");
		 String exparyDate = req.getParameter("ExparyDate");
		 String pin = req.getParameter("Pin");
		 System.out.println("Data Receved From Clinet Bolte  ");
		 
		 System.out.println("Card Holder Name: " + name);
		 System.out.println("Card Number: " + cardnum);
		 System.out.println("Expiry Date: " + exparyDate);
		 System.out.println("PIN: " + pin);

		 
		 PrintWriter out;
		try {
			out = respose.getWriter();	
			out.print("Data Recived");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
