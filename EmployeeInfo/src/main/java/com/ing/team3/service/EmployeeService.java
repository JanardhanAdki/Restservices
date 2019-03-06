package com.ing.team3.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ing.team3.dao.EmployeeDao;
import com.ing.team3.modal.Employee;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeDao employeeDao;

	public Iterable<Employee> getEmployees() {

		return employeeDao.findAll();
	}

	public Optional<Employee> getEmployeeById(int id) {
		return employeeDao.findById(id);
	}

	public void addEmployee(Employee emp) {

		employeeDao.save(emp);
	}
	
	public void updateEmployee(Employee emp)
	{
		employeeDao.save(emp);
	}

	public void deleteEmployee(int id) {
		employeeDao.deleteById(id);
	}

	public ResponseEntity getAllEmployees() {
		return (ResponseEntity.ok(employeeDao.findAll()));
		
	}
	
	

}
