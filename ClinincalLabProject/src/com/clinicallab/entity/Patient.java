package com.clinicallab.entity;

import java.util.Date;

public class Patient {
  
	private Integer id;
	private String name;
	private Long mobile;
	private String sex;
	private String add;
	private Date dob;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Patient(Integer id, String name, Long mobile, String sex, String add, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.sex = sex;
		this.add = add;
		this.dob = dob;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", mobile=" + mobile + ", sex=" + sex + ", add=" + add
				+ ", dob=" + dob + "]";
	}
	
	
	
	
}
