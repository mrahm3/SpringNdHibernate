package com.clinicallab.entity;

public class Doctor {
 private Integer doctorId;
 private String doctorName;
 
 
public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}


public Doctor(Integer doctorId, String doctorName) {
	super();
	this.doctorId = doctorId;
	this.doctorName = doctorName;
}


public Integer getDoctorId() {
	return doctorId;
}
public void setDoctorId(Integer doctorId) {
	this.doctorId = doctorId;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}


@Override
public String toString() {
	return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + "]";
}
 
 

}
