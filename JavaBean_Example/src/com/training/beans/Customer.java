package com.training.beans;

import java.io.Serializable;
import java.util.logging.*;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Logger log=Logger.getLogger(this.getClass().getName());
	
	public Customer() {
		super();
		log.info("Logger Constructor");
		// TODO Auto-generated constructor stub
	}
	
	  private long customerId;
  private String customerName;
  private String email;
  private long handPhone;
public long getCustomerId() {
	return customerId;
}
public void setCustomerId(long customerId) {
	this.customerId = customerId;
	log.info("Set Customer called");
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
	log.info("------------------------Setting Customer=================");
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getHandPhone() {
	return handPhone;
}
public void setHandPhone(long handPhone) {
	this.handPhone = handPhone;
}

  
  
}
