package com.POJO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="primary_skills")
public class PrimarySkills {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String primary_skill;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrimary_skill() {
		return primary_skill;
	}

	public void setPrimary_skill(String primary_skill) {
		this.primary_skill = primary_skill;
	}
	
	
}
