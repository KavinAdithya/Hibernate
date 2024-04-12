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
    	
    	Student st=new Student("DhaRKaVINani",19,43);
    	
 
    	Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
    	
    	
    	SessionFactory sf=con.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	
    	
    	session.persist(st);
    	
    	tx.commit();
    	
    }
}
