package com.kabira.demos;

import java.sql.SQLException;

public interface Connectivity {
	public boolean addCoins(Coin coinref) throws SQLException;
	public void removeCoins();
	public void showCoins();

	

}
