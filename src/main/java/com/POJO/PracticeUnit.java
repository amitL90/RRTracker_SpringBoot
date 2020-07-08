package com.POJO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="practice_unit")
public class PracticeUnit {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String practic_unit;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPractic_unit() {
		return practic_unit;
	}

	public void setPractic_unit(String practic_unit) {
		this.practic_unit = practic_unit;
	}
	
	
}
