package com.restaurant.entity;

public class Employee {
	private Integer empId;
	private String name;
	private Long empMobile;
	
	
	public Employee(Integer empId, String name, Long empMobile) {
		super();
		this.empId = empId;
		this.name = name;
		this.empMobile = empMobile;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getEmpMobile() {
		return empMobile;
	}


	public void setEmpMobile(Long empMobile) {
		this.empMobile = empMobile;
	}
	
	
	

}
