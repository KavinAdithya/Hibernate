package com.techcrack.Hibernate.techcrack;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;


public class NativeSQLQueries {
	//Driver Mode
	public static void main(String[] args) {
		
		//Session Object Which is Responsible for CRUD Operation RDB
		Session session=Hibernate.getSessionFactory().openSession();
		
		List<Car> list=getDataSQLNative(session);
		
		for(Car c:list) {
			System.out.println(c);
		}
	}
	
	
	//Method which is responsible for getting data from database using SQLQuery Native Object
	private static List<Car> getDataSQLNative(Session session){

		//SubQuery
		String subQuery="WHERE Car_name='BNW'";
		
		//Query
		String query="SELECT * FROM car"+subQuery;
		System.out.println(query);
		return new ArrayList<Car>();
	}

}
