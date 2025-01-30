package com.kabira;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import java.lang.module.Configuration;
import org.hibernate.cfg.Configuration;



public class MainApp {
	
	public static void main(String[] args) {
		
		User user1 = new User("101","Ajay","123");
		Configuration cnfg = new Configuration();
		cnfg.configure("index.xml");
		SessionFactory factory = cnfg.buildSessionFactory();
		Session ses = factory.openSession();
		
		Transaction transaction = ses.beginTransaction();
		ses.persist(user1);
		
		transaction.commit();
		ses.close();
		
		
		
		
		
	}

}
