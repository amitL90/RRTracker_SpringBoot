package com.POJO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int profileID;
	int psNumber;
	String nameOfResource;
	String practiceUnit;
	String status;
	String IntExtSource;
	String comments;	

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "requestID", nullable = false)
	Requirment requirment;
	
	
	public int getProfileID() {
		return profileID;
	}

	public void setProfileID(int profileID) {
		this.profileID = profileID;
	}

	public int getPsNumber() {
		return psNumber;
	}

	public void setPsNumber(int psNumber) {
		this.psNumber = psNumber;
	}

	public String getNameOfResource() {
		return nameOfResource;
	}

	public void setNameOfResource(String nameOfResource) {
		this.nameOfResource = nameOfResource;
	}

	public String getPracticeUnit() {
		return practiceUnit;
	}

	public void setPracticeUnit(String practiceUnit) {
		this.practiceUnit = practiceUnit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIntExtSource() {
		return IntExtSource;
	}

	public void setIntExtSource(String intExtSource) {
		IntExtSource = intExtSource;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Requirment getRequirment() {
		return requirment;
	}

	public void setRequirment(Requirment requirment) {
		this.requirment = requirment;
	}

	public Profile() {

	}

}
