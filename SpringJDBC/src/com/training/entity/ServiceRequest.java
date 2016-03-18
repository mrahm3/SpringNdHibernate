package com.training.entity;

import org.springframework.stereotype.Component;

@Component("serviceRequest")
public class ServiceRequest {
  private Customer cust;
  private Item product;
  private int complainId;
  private String description;
public ServiceRequest() {
	super();
	
}
public ServiceRequest(Customer cust, Item product, int complainId, String description) {
	super();
	this.cust = cust;
	this.product = product;
	this.complainId = complainId;
	this.description = description;
}
public Customer getCust() {
	return cust;
}
public void setCust(Customer cust) {
	this.cust = cust;
}
public Item getProduct() {
	return product;
}
public void setProduct(Item product) {
	this.product = product;
}
public int getComplainId() {
	return complainId;
}
public void setComplainId(int complainId) {
	this.complainId = complainId;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "ServiceRequest [cust=" + cust + ", product=" + product + ", complainId=" + complainId + ", description="
			+ description + "]";
}
  
  
 
}
