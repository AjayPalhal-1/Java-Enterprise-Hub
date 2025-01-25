package com.kabira.uservalidation;

public class UserVerification {
	public boolean verify(User ref)
	{
		UserDataBaseConnectivity userDBConnect = new UserDataBaseConnectivity() ;
		return userDBConnect.isValid(ref);
	}

}
