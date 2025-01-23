package com.kabira.webp;

public class FileConnectivity implements Connectivity {

	public boolean checkInFile(Card ref) {
		FileConnectivity fileConnect = new FileConnectivity();
		fileConnect.checkInFile(ref);
		return false;

	}

	@Override
	public boolean isValid(Card ref) {
		// TODO Auto-generated method stub
		return false;
	}

}
