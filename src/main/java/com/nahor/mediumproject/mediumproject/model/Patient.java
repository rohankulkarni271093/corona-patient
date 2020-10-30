package com.nahor.mediumproject.mediumproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;



public class Patient {
	

	public int patientId;
	public String patientName;
	public Character patentGender;
	public String patientStatus;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Character getPatentGender() {
		return patentGender;
	}
	public void setPatentGender(Character patentGender) {
		this.patentGender = patentGender;
	}
	public String getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(String patientStatus) {
		this.patientStatus = patientStatus;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patentGender=" + patentGender
				+ ", patientStatus=" + patientStatus + "]";
	}
	
	
	
}
