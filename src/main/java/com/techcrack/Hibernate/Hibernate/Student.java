package com.techcrack.Hibernate.Hibernate;

import java.util.List;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
//
//import jakarta.persistence.Cacheable;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



@SuppressWarnings("unused")
@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Student { 
	@Id
	private int id;
	private String name;
	private int age;
	//@OneToOne
	//private Laptop lap;
	
	/*
	 * decalring object state to store 
	 * value of temporaryly and 
	 * their states are encapsulated
	 * which means cannot be access form other classes directly
	 * 
	 */
	public Student(){
		super();
	
	}

	/*
	 * parameterized Constructor 
	 * On instantiating this class
	 * Mandatory to provide instance state's
	 */ 
	public Student(String name,int age,int id) {
		this.name=name;
		this.age=age;
		this.id=id;
	}
//	public Laptop getLap() {
//		return lap;
//	}

//	public void setLap(Laptop lap) {
//		this.lap = lap;
//	}

	/*
	 * Beans For Accesing instance state indirectly which is encaapsulated from other
	 * classes 
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
		
	@Override
	public String toString() {
		return "["+name+" "+age+" "+id+"]";
	}

}
