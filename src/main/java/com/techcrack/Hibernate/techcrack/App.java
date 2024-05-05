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
    	
    	Professor wif=new Professor();
    	
    	wif.setName("Vijay");
    	wif.setAge(54);
    	wif.setId(48);
    	wif.setSpouse("Samantha");
    	wif.setDegree("BE.ME");
    	wif.setChild("Joseph Vijay");
    	wif.setPhoneNumber("7456981527");
    	wif.setEmail("vijaytvk@gmail.com");
    	wif.setFather("Kuruvi");
    	
    	Transaction trans=session.beginTransaction();
    	
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
    	//session.persist(d2);
    	//session.persist(depart);
    	wif.setDepart_id(list);
    	session.persist(wif);
    	//session.persist(wif);
    	//System.out.println(session.get(Professor.class, 19));
    	
//    	Professor ramya=session.get(Professor.class,1);
//    	
//    	ramya.setFather("John");
//    	ramya.setDegree("BE.ME");
//    	
//    	session.update(ramya);
    	
//    	Professor saranya=session.get(Professor.class,99);
//    	
//    	session.delete(saranya);
    	trans.commit();
    }
}
