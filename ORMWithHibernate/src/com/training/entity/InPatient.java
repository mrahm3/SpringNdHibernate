package com.training.entity;

import java.io.Serializable;

import java.sql.Timestamp;

public class InPatient extends Patient implements Serializable {

	private String wardNumber;
	private Timestamp dateOfAdmission;
	public InPatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InPatient(String patientName, int age) {
		super(patientName, age);
		
			}
	
	
	public InPatient(String patientName, int age,String wardNumber, Timestamp dateOfAdmission) {
		super(patientName, age);
		this.wardNumber = wardNumber;
		this.dateOfAdmission = dateOfAdmission;
		
	}
	@Override
	public String toString() {
		return "InPatient [wardNumber=" + wardNumber + ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	public InPatient(String wardNumber, Timestamp dateOfAdmission) {
		super();
		this.wardNumber = wardNumber;
		this.dateOfAdmission = dateOfAdmission;
	}
	public String getWardNumber() {
		return wardNumber;
	}
	public void setWardNumber(String wardNumber) {
		this.wardNumber = wardNumber;
	}
	public Timestamp getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(Timestamp dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	
	
	
	
	
	
}
