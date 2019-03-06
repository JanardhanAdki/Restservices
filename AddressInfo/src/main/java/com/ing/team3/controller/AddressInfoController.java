package com.ing.team3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.ing.team3.modal.AddressInfo;
import com.ing.team3.service.AddressInfoService;

@RestController
@RequestMapping("/")
public class AddressInfoController {

	@Autowired
	private AddressInfoService addressInfoService;

	@RequestMapping("/home")
	public String message() {

		return "Hello welcome";
	}

	@PostMapping("/addressinfo")
	public void addEmployee(@RequestBody AddressInfo addressInfo) {
		addressInfoService.addAddrssInfo(addressInfo);;
		String response = "{\"success\": true, \"message\": Employee has been added successfully.}";
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/addressinfo/{id}")
	public void updateEmployee(@RequestBody AddressInfo addressInfo, @PathVariable String id) {
		addressInfoService.updateAddressInfo(addressInfo);
		String response = "{\"success\": true, \"message\": Employee has been updated successfully.}";
	}

	@DeleteMapping("/addressinfo/{id}")
	public void deleteEmployee(@PathVariable int id) {
		addressInfoService.deleteAddressInfo(id);
		String response = "{\"success\": true, \"message\": Employee has been deleted successfully.}";
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/alladdressinfo")
	public ResponseEntity<AddressInfo>  getEmployees() {
		
		return addressInfoService.getAddrssInfo();
		//String response = "{\"success\": true, \"message\": Employees retrieved successfully.}";
	}

}