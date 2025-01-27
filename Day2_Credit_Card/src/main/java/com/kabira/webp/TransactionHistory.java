package com.kabira.webp;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/history")

public class TransactionHistory extends HttpServlet {
	
	public void service(HttpServletRequest req , HttpServletResponse response) throws IOException
	{
		System.out.println("Now We Are In Checking Card History ...!");
		response.sendRedirect("history.html");

	}

}
