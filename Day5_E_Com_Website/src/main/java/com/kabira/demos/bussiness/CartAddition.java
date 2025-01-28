package com.kabira.demos.bussiness;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kabira.demos.datacesses.CartAccess;
import com.kabira.demos.datapersistance.DatabaseConnectivity;
import com.kabira.demos.entity.Product;

public class CartAddition {
	
	static List <Product> cart =  new ArrayList();
	
	public void addToCart(Product info)
	{
		cart.add(info);
		
		
	}
	
	public void chekout() 
	{
		CartAccess dbobj = new DatabaseConnectivity();
		System.out.println("in db vala function");
		System.out.println(cart.size()+" size lelo");
		try {
			dbobj.storeProduct(cart);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
