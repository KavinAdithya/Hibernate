package com.techcrack.Hibernate.techcrack;

import javax.persistence.Embeddable;
//import jakarta.persistence.Embeddable;


@Embeddable
public class Name {
	
	private String leftName;
	private String middleName;
	private String rightName;
	public String getLeftName() {
		return leftName;
	}
	public void setLeftName(String leftName) {
		this.leftName = leftName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getRightName() {
		return rightName;
	}
	public void setRightName(String rightName) {
		this.rightName = rightName;
	}
	@Override
	public String toString() {
		return " leftName=" + leftName + ", middleName=" + middleName + ", rightName=" + rightName + " ";
	}
	
}
