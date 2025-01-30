package com.kabira;

import org.hibernate.annotations.JoinColumnOrFormula;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userinfo")



public class User {
	
	@Id
	@Column (name= "userid")
	String username ;
	@Column (name="username")
	String userid ;
	@Column (name="userpass")
	String userpass;
	public User(String username, String userid, String userpass) {
		super();
		this.username = username;
		this.userid = userid;
		this.userpass = userpass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	

}
