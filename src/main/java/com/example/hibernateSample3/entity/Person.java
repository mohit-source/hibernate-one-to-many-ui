package com.example.hibernateSample3.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="Person_o2m_Uni")
@Entity(name="Person")
public class Person {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER.EAGER)
	private List<Phone> phones = new ArrayList<Phone>();
	
	


	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	
	
	public String toString() {
		 return "Phone [id=" +id + ", name="+ name+ ", Phones = "+phones +"]";
	 }

}

