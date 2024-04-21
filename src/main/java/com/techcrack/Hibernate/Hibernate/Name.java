package com.techcrack.Hibernate.Hibernate;

import jakarta.persistence.Embeddable;

@Embeddable
public class Name {
	@Override
	public String toString() {
		return "Name [sname=" + sname + ", mname=" + mname + ", lname=" + lname + "]";
	}
	private String sname;
	private String mname;
	private String lname;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}
