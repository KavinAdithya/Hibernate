package com.techcrack.Hibernate.techcrack;
//Classes
import org.hibernate.cfg.Configuration;

import java.util.List;

import java.util.ArrayList;
//Interfaces
import org.hibernate.SessionFactory;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	//Driver Mode
    public static void main( String[] args ){
        config();
    }
    
    //Actual huiibernate implemantation 
    @SuppressWarnings("deprecation")
	private static void config() {
    	Configuration config=new Configuration();
    	
    	config.configure("hibernate.cfg.xml").addAnnotatedClass(Department.class).addAnnotatedClass(Professor.class);
    	
    	SessionFactory sf=config.buildSessionFactory();
    	
    	Session session=sf.openSession();
   	
    	Transaction trans=session.beginTransaction();

    	//Data Insert
    	//dataInsert(session);
    	
    	//Eager
    	//eagerAndLazy(session);
    	
    	//first level caching
    	//firstLevelCaching(session);
    	
    	//Second level caching
    	Session s2=sf.openSession();
    	secondLevelCaching(session,s2);
    	trans.commit();
    }
    
    //Eager And Lazy concept
    private static void eagerAndLazy(Session session) {
    	Professor teach=(Professor)session.get(Professor.class,43);
    	
    	List<Department> lap=teach.getDepart_id();
    	
    	for(Department d:lap) {
    		System.out.println(d);
    	}
    	
    }
    
    //first level caching defaultly hibernate wil provide this feature
    private static void firstLevelCaching(Session session) {
    	Professor p1=(Professor)session.get(Professor.class,43);
    	Professor p2=(Professor)session.get(Professor.class,43);
    }
    
    //Second level caching 
    private static void secondLevelCaching(Session session,Session s2) {
    		Professor p1=(Professor)session.get(Professor.class, 43);
    		Professor p2=(Professor)s2.get(Professor.class,43);
    }
    
    //Method whic is used to insert data on database both mapping relationship[ as well as
    private static void dataInsert(Session session) {
    	
    	Professor wif=new Professor();
    	
  
    	wif.setAge(54);
    	wif.setId(488);
    	wif.setSpouse("Samantha");
    	wif.setDegree("BE.ME");
    	wif.setChild("Joseph Vijay");
    	wif.setPhoneNumber("7456981527");
    	wif.setEmail("vijaytvk@gmail.com");
    	wif.setFather("Kuruvi");
    	
    	
    	
    	Name name=new Name();
    	name.setLeftName("Computer");
    	name.setMiddleName("Science");
    	name.setRightName("Engineering");
    	
    	Department depart=new Department();
    	depart.setId(1);
    	depart.setName(name);
    	
    	Name ece=new Name();
    	ece.setLeftName("Electronics");
    	ece.setMiddleName(" And Communication");
    	ece.setRightName("Enginaeering");
    	
    	Department d2=new Department();
    	d2.setId(2);
    	d2.setName(ece);
    	
    	List<Department> list=new ArrayList<>();
    	list.add(depart);
    	list.add(d2);
    	session.persist(d2);
    	session.persist(depart);
    	wif.setDepart_id(list);
    	session.persist(wif);
    	session.persist(wif);
    	System.out.println(session.get(Professor.class, 19));
    	
    	Professor ramya=(Professor)session.get(Professor.class,1);
    	
    	ramya.setFather("John");
    	ramya.setDegree("BE.ME");
    	session.update(ramya);
    	
    	Professor saranya=(Professor)session.get(Professor.class,99);
    	
    	session.delete(saranya);
    	
    }
}
