package com.training.entity;

import java.io.Serializable;

public class Patient implements Serializable {

	private String patientName;
	private int age;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String patientName, int age) {
		super();
		this.patientName = patientName;
		this.age = age;
	}

	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", age=" + age + "]";
	}
	
	
}
