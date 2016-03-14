package com.training.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component("carRental")
public class CarRental {

	@NotEmpty
	private String name;
	
	@Max(9999999999L)
	@Min(1000000000L)
	private long mobileNumber;
	@Email
	private String email;
	private String type;
	public CarRental() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarRental(String name, long mobileNumber, String email, String type) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "CarRental [name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email + ", type=" + type
				+ "]";
	}
	
	
	
	
}
