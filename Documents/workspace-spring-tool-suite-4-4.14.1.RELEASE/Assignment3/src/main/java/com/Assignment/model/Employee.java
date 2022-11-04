package com.Assignment.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
public class Employee {

@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
	}
public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
private String firstName;
private String lastName;
private String mobileNumber;

}
