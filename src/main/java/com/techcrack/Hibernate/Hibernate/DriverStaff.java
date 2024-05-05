package com.techcrack.Hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DriverStaff {
	public static void main(String[] args) {
		connector();
	}
	
	//Connecting the configuration and connecting the database
	private static void connector() {
		//Creating object of configuration
		Configuration config=new Configuration();
		
		//config it
		config.configure("hibernate.cfg.xml").addAnnotatedClass(Staff.class);
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction transaction =session.beginTransaction();
		
		
		Staff staff=new Staff();
		staff.setName("Dharani SK");
		staff.setDegree("B.E.M.E.Phd");
		staff.setChild("AdithyaAdithi");
		staff.setSpouse("Kavin_Adithya");
		staff.setId(19);
		//staff.setDepartment("food Technology");
		staff.setPhoneNo("6374596647");
		staff.setEmail("dharaniadithi3@gamil.com");
		Department food=new Department();
		food.setId(1);
		food.setName("food technology");
		Department cse=new Department();
		cse.setId(2);
		cse.setName("Computer Science Engineering");
		
		//session.persist(food);
		//session.persist(cse);
		session.persist(staff);
		
		transaction.commit();
	}
	
	private static void pushData(Session session,Transaction trans) {
		Staff staff=new Staff();
		staff.setName("Dharani SK");
		staff.setDegree("B.E.M.E.Phd");
		staff.setChild("AdithyaAdithi");
		staff.setSpouse("Kavin_Adithya");
		staff.setId(19);
		//staff.setDepartment("food Technology");
		staff.setPhoneNo("6374596647");
		staff.setEmail("dharaniadithi3@gamil.com");
		Department food=new Department();
		food.setId(1);
		food.setName("food technology");
		Department cse=new Department();
		cse.setId(2);
		cse.setName("Computer Science Engineering");
		
		//session.persist(food);
		//session.persist(cse);
		session.persist(staff);
		
		trans.commit();
	}
}
