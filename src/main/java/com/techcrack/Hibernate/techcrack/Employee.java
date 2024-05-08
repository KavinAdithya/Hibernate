package com.techcrack.Hibernate.techcrack;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.util.List;

@Entity
@Table(name="Workers")
public class Employee {
	
	@Id
	@Column(name="emp_id")
	private String empId;
	@Column(name="Name")
	private String name;
	@Column(name="Age")
	private int age;
	@Column(name="Salary")
	private long salary;
	@Column(name="Phone_Number")
	private String phoneNumber;
	@Column(name="Car")
	@OneToMany
	private List<Car> car;
	
	//Employee-Id
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	//Age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Salary
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	//Mobile-Number
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//Name 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//car
	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
	}
	
	
	//Overeriding the To String method which was invoked during printing the object
	@Override
	public String toString() {
		return " "+empId+" : "+name+" : "+age+" : "+salary+" "+phoneNumber;
		
	}

}
