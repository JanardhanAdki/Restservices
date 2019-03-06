package com.ing.team3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ing.team3.modal.AddressInfo;
import com.ing.team3.modal.Employee;
import com.ing.team3.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/home")
	public String message() {

		return "Hello welcome";
	}

	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) 
	{
		System.out.println("Janardhan: "+employee.getAddressInfo().getEmpId());
		employeeService.addEmployee(employee);
		
		//Starts here
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:2030//" + "addressinfo/";
		System.out.println("URL" + url);
		
		AddressInfo af = new AddressInfo();
		af = employee.getAddressInfo();
		
		af.setStreetName(employee.getAddressInfo().getStreetName());
		af.setAreaName(employee.getAddressInfo().getAreaName());
		af.setCity(employee.getAddressInfo().getCity());
		af.setEmpId(employee.getId());
		
		ResponseEntity<AddressInfo> result = restTemplate.postForEntity(url, af, AddressInfo.class);
		
		System.out.println("Address_EmpID: " + af.getEmpId());
				
		//ends here
		//String response = "{\"success\": true, \"message\": Employee has been added successfully.}";
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
		employeeService.updateEmployee(employee);
		String response = "{\"success\": true, \"message\": Employee has been updated successfully.}";
	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		String response = "{\"success\": true, \"message\": Employee has been deleted successfully.}";
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/allemployees")
	public ResponseEntity<Employee>  getEmployees() {
		
		return employeeService.getAllEmployees();
		//String response = "{\"success\": true, \"message\": Employees retrieved successfully.}";
	}

}