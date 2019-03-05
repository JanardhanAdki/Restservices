package com.ing.team3.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ing.team3.modal.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>  {
	
	
}

	

