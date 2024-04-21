package com.techcrack.Hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	hibernate();
    }
    
    public static void  hibernate() {
    	Name name=new Name();
    	name.setLname("Dharani");
    	name.setSname("Kavin");
    	name.setMname("Adithya");
    	Student st=new Student();
    	
    	Student s=null;
    	Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
    	
    	
    	SessionFactory sf=con.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
    	
    	Transaction tx=session.beginTransaction();
    	session.persist(st);
    	
    	 s=session.get(Student.class,3);
    	    
    	tx.commit();
    	System.out.println(s);
    	
    }
}
