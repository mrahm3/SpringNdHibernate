package com.restaurant.entity;

public class DiningTable {

	private Integer tableNo;
	private Integer empId;




	public DiningTable(Integer tableNo, Integer empId) {
		super();
		this.tableNo = tableNo;
		this.empId = empId;
	}




	public Integer getTableNo() {
		return tableNo;
	}




	public void setTableNo(Integer tableNo) {
		this.tableNo = tableNo;
	}




	public Integer getEmpId() {
		return empId;
	}




	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	
	
	
}
