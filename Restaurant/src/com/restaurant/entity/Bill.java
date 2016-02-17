package com.restaurant.entity;

import java.sql.Timestamp;

public class Bill {
  
	private Integer billNo;
	private Timestamp time;
	private String customerName;
	private Integer numberOfDiner;
	private Integer tableNo;
	private double amount;
	public Bill(Integer billNo, Timestamp time, String customerName, Integer numberOfDiner, Integer tableNo,
			double amount) {
		super();
		this.billNo = billNo;
		this.time = time;
		this.customerName = customerName;
		this.numberOfDiner = numberOfDiner;
		this.tableNo = tableNo;
		this.amount = amount;
	}
	public Integer getBillNo() {
		return billNo;
	}
	public void setBillNo(Integer billNo) {
		this.billNo = billNo;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getNumberOfDiner() {
		return numberOfDiner;
	}
	public void setNumberOfDiner(Integer numberOfDiner) {
		this.numberOfDiner = numberOfDiner;
	}
	public Integer getTableNo() {
		return tableNo;
	}
	public void setTableNo(Integer tableNo) {
		this.tableNo = tableNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
