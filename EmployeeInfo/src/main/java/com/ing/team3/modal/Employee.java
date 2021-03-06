package com.ing.team3.modal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	@JoinColumn(name = "address_id")
	@OneToOne(cascade = CascadeType.ALL)
	private AddressInfo addressInfo;

	public AddressInfo getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(AddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}

	public Employee() {

	}

	/*
	 * @OneToMany private Address address;
	 */

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;

		// this.address=new Address(address,"","");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addressInfo=" + addressInfo + "]";
	}
}
