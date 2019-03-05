package com.ing.team3.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	
	
	/*@OneToMany
	private Address address;*/
	
	public Employee() {
		
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		//this.address=new Address(address,"","");
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



}
