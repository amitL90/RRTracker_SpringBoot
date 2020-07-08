package com.POJO;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Requirment")
public class Requirment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int requestID;

	String deliveryMgr;

	String portfolio;
	int probability;
	Date monthOnboarding;
	String demandStatus;

	String clientOnboardingStatus;
	String rrNumber;
	String primarySkills;
	String practiceUnit;
	String comments;

	// 0: Requirement is deleted
	Integer active;

	String location;
	
	String rtbctb;

	@JsonManagedReference
	@OneToMany(mappedBy = "requirment", cascade = CascadeType.ALL)
	List<Profile> profile;

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public String getDeliveryMgr() {
		return deliveryMgr;
	}

	public void setDeliveryMgr(String deliveryMgr) {
		this.deliveryMgr = deliveryMgr;
	}

	public String getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}

	public int getProbability() {
		return probability;
	}

	public void setProbability(int probability) {
		this.probability = probability;
	}

	public Date getMonthOnboarding() {
		return monthOnboarding;
	}

	public void setMonthOnboarding(Date monthOnboarding) {
		this.monthOnboarding = monthOnboarding;
	}

	public String getDemandStatus() {
		return demandStatus;
	}

	public void setDemandStatus(String demandStatus) {
		this.demandStatus = demandStatus;
	}

	public String getClientOnboardingStatus() {
		return clientOnboardingStatus;
	}

	public void setClientOnboardingStatus(String clientOnboardingStatus) {
		this.clientOnboardingStatus = clientOnboardingStatus;
	}

	public String getRrNumber() {
		return rrNumber;
	}

	public void setRrNumber(String rrNumber) {
		this.rrNumber = rrNumber;
	}

	public String getPrimarySkills() {
		return primarySkills;
	}

	public void setPrimarySkills(String primarySkills) {
		this.primarySkills = primarySkills;
	}

	public String getPracticeUnit() {
		return practiceUnit;
	}

	public void setPracticeUnit(String practiceUnit) {
		this.practiceUnit = practiceUnit;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<Profile> getProfile() {
		return profile;
	}

	public void setProfile(List<Profile> profile) {
		this.profile = profile;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	public String getRtbctb() {
		return rtbctb;
	}

	public void setRtbctb(String rtbctb) {
		this.rtbctb = rtbctb;
	}

	public Requirment() {

	}
	
	

	@Override
	public String toString() {
		return "Requirment [requestID=" + requestID + ", deliveryMgr=" + deliveryMgr + ", portfolio=" + portfolio
				+ ", probability=" + probability + ", monthOnboarding=" + monthOnboarding + ", demandStatus="
				+ demandStatus + ", clientOnboardingStatus=" + clientOnboardingStatus + ", rrNumber=" + rrNumber
				+ ", primarySkills=" + primarySkills + ", practiceUnit=" + practiceUnit + ", comments=" + comments
				+ ", profile=" + profile + "]";
	}

}
