package com.training.entity;

import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {

	
	private String customerName;
	private long mobileNumber;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", mobileNumber=" + mobileNumber + "]";
	}
	public Customer(String customerName, long mobileNumber) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
	}
	
	
}
