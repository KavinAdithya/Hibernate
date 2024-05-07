package com.techcrack.Hibernate.techcrack;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import java.util.List;

@Entity
public class Professor {
	@Id
	private int id;
	private String father;
	@Column(name="Full-Name")
	private String name;
//	@Transient
	private String degree;
	private int age;
	private String spouse;
	private String child;
	private String email;
	private String phoneNumber;
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Department> depart_id;
	
	//Department ID
	public List<Department> getDepart_id() {
		return depart_id;
	}
	public void setDepart_id(List<Department> depart_id) {
		this.depart_id = depart_id;
	}
	
	//Profesor_Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Qualification
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	//Age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Spouse
	public String getSpouse() {
		return spouse;
	}
	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}
	
	//Child
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	
	//E-Mail
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Phone Number
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", degree=" + degree + ", age=" + age + ", spouse=" + spouse
				+ ", child=" + child + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	//Father
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
}
