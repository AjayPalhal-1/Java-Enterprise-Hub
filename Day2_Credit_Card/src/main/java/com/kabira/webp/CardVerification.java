package com.kabira.webp;

// This Is Business Logic Component 

public class CardVerification {
	
	public boolean verify(Card ref) {
		DataBaseConnectivity dbConnect = new DataBaseConnectivity();

		return dbConnect.isCardPresent(ref);
	}

}
