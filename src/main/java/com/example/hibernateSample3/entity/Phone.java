package com.example.hibernateSample3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Phone_o2m_Uni")
@Entity(name="Phone")
public class Phone {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "phone_number")
	private String number;

	public long getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	

	 public String toString() {
		 return "Phone [id=" +id + ", Number="+ number+ "]";
	 }
}
