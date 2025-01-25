package com.kabira.uservalidation;

public class User {
	
	String userName;
	String userPass;
	String userID;
	public User(String userName, String userPass , String userId) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.userID= userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	
	
	
	

}
