package com.POJO;

import java.util.List;

public class DropDownPojo {

	
	private List<DeliveryManager> deliverymanager;
	private List<Portfolio> portfolio;
	private List<PracticeUnit>practiceUnit;
	private List<PrimarySkills>primarySkill;
	private List<Location> locations;
	
	
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	public List<DeliveryManager> getDeliverymanager() {
		return deliverymanager;
	}
	public void setDeliverymanager(List<DeliveryManager> deliverymanager) {
		this.deliverymanager = deliverymanager;
	}
	public List<Portfolio> getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(List<Portfolio> portfolio) {
		this.portfolio = portfolio;
	}
	public List<PracticeUnit> getPracticeUnit() {
		return practiceUnit;
	}
	public void setPracticeUnit(List<PracticeUnit> practiceUnit) {
		this.practiceUnit = practiceUnit;
	}
	public List<PrimarySkills> getPrimarySkill() {
		return primarySkill;
	}
	public void setPrimarySkill(List<PrimarySkills> primarySkill) {
		this.primarySkill = primarySkill;
	}
	
	
	
}
