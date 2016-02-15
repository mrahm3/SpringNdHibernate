package com.restaurant.entity;

public class Users {
   private Integer empId;
   private String password;
   private String role;
   
   
public Users(Integer empId, String password, String role) {
	super();
	this.empId = empId;
	this.password = password;
	this.role = role;
}


public Integer getEmpId() {
	return empId;
}


public void setEmpId(Integer empId) {
	this.empId = empId;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getRole() {
	return role;
}


public void setRole(String role) {
	this.role = role;
}


   
   
}
