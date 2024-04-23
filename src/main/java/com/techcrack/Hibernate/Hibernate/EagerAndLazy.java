package com.techcrack.Hibernate.Hibernate;

//Classes
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;

//Interface
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class EagerAndLazy {
	//Driver Mode
	public static void main(String[] args) {
		//invoking lazy method
		lazyAndEager();
	}
	
	/*
	 * Lazy fetch when we an two table which is connected based on some relation
	 * One table is depend on other table
	 * When we are fetching the data from table it will not fetch the dependent table'
	 * when we make saparate call for that then only it will hibernate generate an query and generate the data
	 * This is called LAZY fetch
	 */
	private static void lazyAndEager() {
		//First We needed to configure the file XML or java configuration
		Configuration config=new Configuration();
		
		//initating to check the configuretion file is syntatically correct and generate meta-data Object 
		config.configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
		
		//It is responsible for connecting database and getting the details about from meta-data Object
		SessionFactory sf=config.buildSessionFactory();
		
		//This Object is Responsible for generating queries with actual data which is gonna perform any CRUD operation on database
		Session session=sf.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Laptop laptop=(Laptop)session.get(Laptop.class, 1);

		
		Session session1=sf.openSession();
		
		Laptop laptop1=(Laptop)session1.get(Laptop.class,1);
//		List<Student> list=laptop.getStud();
//		
//		for(Student stud:list) {
//			System.out.println(stud);
//		}
//		
		transaction.commit();
	}
}
