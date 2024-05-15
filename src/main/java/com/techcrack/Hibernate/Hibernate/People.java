package com.techcrack.Hibernate.Hibernate;

import jakarta.persistence.*;

@Entity
public class People {
	@Id
	private int peopleId;
	
	private String name;

	@OneToOne
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public int getPeopleId() {
		return peopleId;
	}

	public void setPeopleId(int peopleId) {
		this.peopleId = peopleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "People [peopleId=" + peopleId + ", name=" + name + ", laptop=" + laptop + ", getLaptop()=" + getLaptop()
				+ ", getPeopleId()=" + getPeopleId() + ", getName()=" + getName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
