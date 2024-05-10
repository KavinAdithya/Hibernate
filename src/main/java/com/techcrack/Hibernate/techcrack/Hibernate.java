package com.techcrack.Hibernate.techcrack;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Hibernate {
	private static final SessionFactory sf=buildTheSessionFactory();
	
	private static SessionFactory buildTheSessionFactory() {
		
		//Configure Object which is resposbile to generate the meta-data object 
		//about the database connector and
		Configuration config=new Configuration();
		
		config.configure().addAnnotatedClass(Car.class);
		
		
		 return config.buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}
}
