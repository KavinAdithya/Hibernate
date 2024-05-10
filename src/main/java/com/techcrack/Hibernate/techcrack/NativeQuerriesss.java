package com.techcrack.Hibernate.techcrack;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

public class NativeQuerriesss {
	private static List<Car> getDataFromNative(Session session){
		session.beginTransaction();
		
		String query="SELECT * FROM Car WHERE Car_name= :B";
		
		@SuppressWarnings("deprecation")
		NativeQuery<Car> list=session.createNativeQuery(query);
		list.addEntity(Car.class);
		list.setParameter("B","BMw2005");
		
		List<Car> l=list.getResultList();
		
		//session.getTransaction().commit();
		
		Car c=l.get(0);
		c.setName("BMw----2005");
		
		session.persist(c);
		
		session.getTransaction().commit();
		
		c.setName("BMW----");
		return l;
	}
	
	//Driver mode
	public static void main(String[] args) {
		//Session Object
		Session session=Hibernate.getSessionFactory().openSession();
		
	//	List<Car> list=getDataFromNative(session);
		
		//for(Car k:list) {
			//System.out.println(k);
			//System.out.println(k[0]+" : "+k[1]+" : "+k[2]);
		//}
		
		//Load And get
		Car c=session.get(Car.class,"TN 29 AN 9361");
		
		System.out.println(c);
		
		Car c1=session.load(Car.class, "TN 61 KN 433");
		
		System.out.println(c1);
	}
}
