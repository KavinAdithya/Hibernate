package com.techcrack.Hibernate.Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


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
	@ManyToMany
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
