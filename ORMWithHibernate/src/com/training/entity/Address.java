package com.training.entity;

public class Address {

	
	private String addline1;
	private String addline2;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAddline1() {
		return addline1;
	}

	public void setAddline1(String addline1) {
		this.addline1 = addline1;
	}

	public String getAddline2() {
		return addline2;
	}

	public void setAddline2(String addline2) {
		this.addline2 = addline2;
	}

	public Address(String addline1, String addline2) {
		super();
		this.addline1 = addline1;
		this.addline2 = addline2;
	}
	
	
	
}
