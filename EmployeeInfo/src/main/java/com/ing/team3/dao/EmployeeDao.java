package com.ing.team3.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ing.team3.modal.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>  {
	
	
}

	

