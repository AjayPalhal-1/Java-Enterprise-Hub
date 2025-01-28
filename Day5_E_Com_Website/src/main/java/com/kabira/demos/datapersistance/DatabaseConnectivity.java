package com.kabira.demos.datapersistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.kabira.demos.datacesses.CartAccess;
import com.kabira.demos.entity.Product;

public class DatabaseConnectivity  implements CartAccess{
	
	
	public Connection connectDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom", "root", "beliver012");
			System.out.println("Connection Did Succesfully......!");
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
	
	@Override
	public boolean storeProduct(List<Product> cart) throws SQLException {
		System.out.println("in db vala function");
	    // Step 1: Establish connection
	    Connection connection = this.connectDatabase();

	    // Step 2: Correct SQL Query (Ensure correct columns and placeholders)
	    String query = "INSERT INTO product (productId, productName, productPrice, productQuantity) VALUES (?, ?, ?, ?)";
	    PreparedStatement pstmt = connection.prepareStatement(query);

	    
	    
	    // Step 3: Loop through the cart and add products to the batch
	    for (Product product : cart) {
	        pstmt.setString(1, product.getProductId());
	        pstmt.setString(2, product.getProductName());
	        pstmt.setString(3, product.getProductPrice());
	        pstmt.setString(4, product.getProductQuantity());
	        pstmt.addBatch(); // Add to batch
	    }

	    // Step 4: Execute batch update
	    int[] results = pstmt.executeBatch();
	    
	    for (int i: results)
	    	System.out.println(i);
	    // Step 5: Clean up resources
	    pstmt.close();
	    connection.close();

	    // Step 6: Return success if all products are inserted
	    return results.length == cart.size();
	}


	

	
}
