package com.ing.team3.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	private int streetNumber;
	private String name;
	public Address() {
		
	}
	public Address(int streetNumber, String name) {
		super();
		this.streetNumber = streetNumber;
		this.name = name;
	}
	
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
