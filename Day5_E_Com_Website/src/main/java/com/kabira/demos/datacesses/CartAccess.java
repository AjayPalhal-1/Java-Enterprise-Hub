package com.kabira.demos.datacesses;

import java.sql.SQLException;
import java.util.List;

import com.kabira.demos.entity.Product;

public interface CartAccess {
	
	public boolean storeProduct( List<Product> cart) throws SQLException;

}
