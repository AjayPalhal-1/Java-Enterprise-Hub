package com.kabira.uservalidation;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userverify")
public class UserCheck  extends HttpServlet{
	
	public void service(HttpServletRequest reqObject , HttpServletResponse resposeObject)
	{
		String username= reqObject.getParameter("username");
		String userid = reqObject.getParameter("userid");
		String userpass= reqObject.getParameter("usepass");
		
		System.out.println("User Name   : " + username);
		System.out.println("User Id     : " + userid);
		System.out.println("User Pass   : " + userpass);
		
		User userObject = new User(username , userpass, userid);
		UserVerification userverificationref= new UserVerification();
		boolean isverified= userverificationref.verify(userObject);
		
		PrintWriter out ;
		try {
			out = resposeObject.getWriter();
			if (isverified == true) {
				out.println("User Is Verified ");
				out.println("User Name       : "+username);
				out.println("User Id         : "+userid);
				out.println("User Password   : "+userpass);

			
			} else {
				out.println("User Is  Not Verified ");

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
