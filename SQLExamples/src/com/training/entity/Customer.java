package com.training.entity;


public class Customer {
	private int customerId;
	private String customerName;
	private String emai_Id;
	private long handPhone;
	
	public Customer() {
		super();
		
	}
	
	

	public Customer(int customerId, String customerName, String emai_Id, long handPhone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.emai_Id = emai_Id;
		this.handPhone = handPhone;
	}



	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmai_Id() {
		return emai_Id;
	}
	public void setEmai_Id(String emai_Id) {
		this.emai_Id = emai_Id;
	}
	public long getHandPhone() {
		return handPhone;
	}
	
	public String showCustomer()
	{
		String cust = customerId +":"+customerName +":"+emai_Id +":"+handPhone;
		return cust;
	}
	

}
