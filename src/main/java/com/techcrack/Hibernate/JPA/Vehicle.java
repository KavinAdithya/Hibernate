package com.techcrack.Hibernate.JPA;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Car")
public class Vehicle {
	@Id
	@Column(name="Register-Number")
	private String regNo;
	@Column(name="Car_Name")
	private String name;
	@Column(name="Model-Year")
	private int year;
	
	//Register-Number
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	//Name of the car
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Model year of the car
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return regNo+" "+name+" "+year;
	}
	
}
