package com.techcrack.Hibernate.Hibernate;

import javax.persistence.Cacheable;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Department {
	@Id
	private int id;
	private String name;
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
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
	
}
