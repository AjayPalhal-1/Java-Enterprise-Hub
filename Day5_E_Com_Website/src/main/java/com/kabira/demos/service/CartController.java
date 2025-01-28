package com.kabira.demos.service;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabira.demos.bussiness.CartAddition;
import com.kabira.demos.entity.Product;

@WebServlet("/product")
public class CartController extends HttpServlet {

//	public void service(HttpServletRequest req , HttpServletResponse res)
//	{
//		String method = req.getMethod();
//	System.out.println("Mehtod : " + method);
//		
//	}
	
	

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		String qnty = (req.getParameter("qnty"));
		String price = req.getParameter("productprice");
		String id = req.getParameter("productId");
		String name = req.getParameter("productName");
		System.out.println(" We Are In Servlet ......");

		String addcart = req.getParameter("addtocart");
//		String checkOut = req.getParameter("CheckOut");
		Product productref = new Product(name, id, qnty, price);
		CartAddition cartaddition = new CartAddition();
		
		System.out.println(addcart+" <-----");
		if (addcart.equals("1")) {
			cartaddition.addToCart(productref);
//			cartaddition.chekout();
			res.sendRedirect("NewFile.html");
		}
		else 
		{
			
			cartaddition.chekout();
		}

		System.out.println("Product ID       :" + id);
		System.out.println("Product Name     :" + name);
		System.out.println("Product Price    : " + price);
		System.out.println("Product Quantity : " + qnty);
		System.out.println("Hi Pan Marli Na Clone Are Bhaii Sudhar Re..........!!!!!");
		System.out.println("Sab Pata Chal Raha Haiiii ..........!!!!!");


		PrintWriter out = res.getWriter();

		out.println(name);
		out.println(id);
		out.println("Marli Ka Clone Sudhar Re...........!!!!");
		out.println("Sab Pata Chal Raha Haiiii ..........!!!!!");


	}

}
