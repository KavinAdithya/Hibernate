package com.techcrack.Hibernate.Hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	//mappingRelationShip();
		oneToOne();
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
    	
    	 s=(Student)session.get(Student.class,3);
    	    
    	tx.commit();
    	System.out.println(s);
    	
    }
    
    public static void mappingRelationShip() {
    	Configuration config=new Configuration();
    	
    	config.configure()
    	      .addAnnotatedClass(Laptop.class)
    		  .addAnnotatedClass(People.class);
    	
    	ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
    			.applySettings(config.getProperties())
    			.build();
    	
    	SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
    	
    	Session session=sessionFactory.openSession();
    	
    	session.getTransaction().begin();;
    	
    	Laptop laptop=new Laptop();
    	laptop.setId(12);
    	laptop.setName("Anbu");
    	//session.persist(laptop);
    	People people=new People();
    	
    	people.setLaptop(laptop);
    	people.setName("Techno");
    	people.setPeopleId(89);
    	
    	session.persist(people);
    	
    	session.getTransaction().commit();
    }
}
