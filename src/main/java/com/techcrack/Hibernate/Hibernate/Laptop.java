package com.techcrack.Hibernate.Hibernate;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToMany;

@SuppressWarnings("unused")
@Entity
public class Laptop {
		
	/*
	 * Instance variable of laptop class and it was encapsulated
	 * using bean for retriving and setting data bean -> Getters And Setters
	 */
	@Id
	private int id;
	private String name;
//	@OneToOne
//	private Student stud;
//	@ManyToOne
//	private Student stud;
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Student> stud=new ArrayList<>();
	
	public List<Student> getStud() {
		return stud;
	}
	public void setStud(List<Student> stud) {
		this.stud = stud;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "["+id+" "+name+"]";
	}
}
