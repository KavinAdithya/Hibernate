package com.techcrack.Hibernate.techcrack;

import javax.persistence.Entity;
import javax.persistence.Id;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;


@Entity
public class Department {
	@Id
	private int id;
	private Name name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
	
}
