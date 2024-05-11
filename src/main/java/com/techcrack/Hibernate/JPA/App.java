package com.techcrack.Hibernate.JPA;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.techcrack.Hibernate.techcrack.Car;
import com.techcrack.Hibernate.techcrack.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("persist");
       
       EntityManager em=emf.createEntityManager();
       
       em.getTransaction().begin();
       
       insertDataCar(em);
       insertDataEmployee(em);
       
       
       Employee e=em.find(Employee.class,"tech$19");
       
       
       em.getTransaction().commit();
       System.out.println(e);
    }
  //method which is responsible to insert the dat into employee table
  	private static void insertDataCar(EntityManager session) {
  		
  		Car c1=new Car();
  		c1.setName("Rolls-Royce Phantom");
  		c1.setRegNo("TN 29 AN 9360");
  		c1.setYear(2005);
  		
  		session.persist(c1);
  		
  		Car c2=new Car();
  		c2.setName("Tesla Model S");
  		c2.setRegNo("TN 89 NC 7400");
  		c2.setYear(2007);
  		
  		session.persist(c2);
  		
  		Car c3=new Car();
  		c3.setName("Porsche 911");
  		c3.setRegNo("TN 39 ZK 1600");
  		c3.setYear(1943);

  		session.persist(c3);
  		
  		Car c4=new Car();
  		c4.setName("Toyota Camry");
  		c4.setRegNo("TN 69 KN 4300");
  		c4.setYear(2000);
  		
  		session.persist(c4);
  		Car c5=new Car();
  		c5.setName("BMW");
  		c5.setRegNo("TN 61 KN 4303");
  		c5.setYear(2000);
  		session.persist(c5);
  		
  	}
  	
  	
  	//method which is responsible for inserting data into car table
  	private static void insertDataEmployee(EntityManager session) {
  		String[] name= {"Kavin","Adithya","Dharani","Adithi","Bharathiyar"};
  		String s="tech$";
  		String[] emp= {s+"43",s+"34",s+"19",s+"91",s+"3"};
  		int[] age= {19,10,20,11,31};
  		long[] salary= {100000,50000,200000,40000,300000};
  		String[] phoneNumber= {"9360016740","7410093600","6374596647","6647637459","8963747400"};
  		
  		Car c1=new Car();
  		c1.setName("Rolls-Royce Phantom");
  		c1.setRegNo("TN 29 AN 9360");
  		c1.setYear(2005);
  		
  		
  		Car c2=new Car();
  		c2.setName("Tesla Model S");
  		c2.setRegNo("TN 89 NC 7400");
  		c2.setYear(2007);
  		
  		
  		Car c3=new Car();
  		c3.setName("Porsche 911");
  		c3.setRegNo("TN 39 ZK 1600");
  		c3.setYear(1943);

  		
  		Car c4=new Car();
  		c4.setName("Toyota Camry");
  		c4.setRegNo("TN 69 KN 4300");
  		c4.setYear(2000);
  		
  		Car c5=new Car();
  		c5.setName("BMW");
  		c5.setRegNo("TN 61 KN 4303");
  		c5.setYear(2000);
  		
  		List<List<Car>> list=new ArrayList<>();
  		
  		List<Car> list1=new ArrayList<>();
  		list1.add(c4);
  	
  		List<Car> list2=new ArrayList<>();
  		list2.add(c1);
  		
  		List<Car> list3=new ArrayList<>();
  		list3.add(c5);
  		
  		List<Car> list4=new ArrayList<>();
  		list4.add(c3);
  		
  		List<Car> list5=new ArrayList<>();
  		list5.add(c2);
  		
  		list.add(list1);
  		list.add(list2);
  		list.add(list3);
  		list.add(list4);
  		list.add(list5);
  		
  		for(int k=0;k<list.size();k++) {
  			Employee employee=new Employee();
  			employee.setEmpId(emp[k]);
  			employee.setName(name[k]);
  			employee.setAge(age[k]);
  			employee.setSalary(salary[k]);
  			employee.setPhoneNumber(phoneNumber[k]);
  			employee.setCar(list.get(k));
  			session.persist(employee);
  		}
  		
  	}
}
