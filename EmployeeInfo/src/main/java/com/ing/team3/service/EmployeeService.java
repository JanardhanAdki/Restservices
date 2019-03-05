package com.ing.team3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.ing.team3.dao.EmployeeDao;
import com.ing.team3.modal.Employee;


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

}
