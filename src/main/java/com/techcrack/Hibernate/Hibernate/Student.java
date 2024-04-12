package com.techcrack.Hibernate.Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	/*
	 * decalring object state to store 
	 * value of temporaryly and 
	 * their states are encapsulated
	 * which means cannot be access form other classes directly
	 * 
	 */
	@Id
	private int id;
	private String name;
	private int age;

	
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
}
