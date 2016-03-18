package com.training.entity;

import java.io.Serializable;
import java.util.Set;



public class Doctor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int doctorCode;
	private String doctorName;
	private long handPhone;
	
	
	private Address resiAddress;
	private Address hospitalAddress;
	private ClinicalAssistant assistant;
	
	private Set<Patient> patientList;
	
	public Set<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(Set<Patient> patientList) {
		this.patientList = patientList;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ClinicalAssistant getAssistant() {
		return assistant;
	}

	public void setAssistant(ClinicalAssistant assistant) {
		this.assistant = assistant;
	}

	
	

	public Doctor(int doctorCode, String doctorName, long handPhone, Address resiAddress, Address hospitalAddress,
			ClinicalAssistant assistant) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
		this.resiAddress = resiAddress;
		this.hospitalAddress = hospitalAddress;
		this.assistant = assistant;
	}

	public int getDoctorCode() {
		return doctorCode;
	}
	public void setDoctorCode(int doctorCode) {
		this.doctorCode = doctorCode;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	public Address getResiAddress() {
		return resiAddress;
	}
	public void setResiAddress(Address resiAddress) {
		this.resiAddress = resiAddress;
	}
	public Address getHospitalAddress() {
		return hospitalAddress;
	}
	public void setHospitalAddress(Address hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	@Override
	public String toString() {
		return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", handPhone=" + handPhone
				+ ", resiAddress=" + resiAddress + ", hospitalAddress=" + hospitalAddress + ", assistant=" + assistant
				+ "]";
	}
	
	
	
	
	
}
