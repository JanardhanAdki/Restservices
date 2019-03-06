package com.ing.team3.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AddressInfo {

	@Id
	@GeneratedValue
	@Column(name = "address_id")
	private int id;
	private String streetName;
	private String areaName;
	private String city;
	private int empId;
	
	public AddressInfo() {

	}

	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empid) {
		this.empId = empid;
	}


	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getAreaName() {
		return areaName;
	}


	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	

}
