package com.ing.team3.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ing.team3.dao.AddressInfoDao;
import com.ing.team3.modal.AddressInfo;

@Service
public class AddressInfoService 
{
	@Autowired
	private AddressInfoDao addressInfoDao;

	public Iterable<AddressInfo> getEmployees() {

		return addressInfoDao.findAll();
	}

	public Optional<AddressInfo> getAddressInfoById(int id) {
		return addressInfoDao.findById(id);
	}

	public void addAddrssInfo(AddressInfo addressInfo) {

		addressInfoDao.save(addressInfo);
	}
	
	public void updateAddressInfo(AddressInfo addressInfo)
	{
		addressInfoDao.save(addressInfo);
	}

	public void deleteAddressInfo(int id) {
		addressInfoDao.deleteById(id);
	}

	public ResponseEntity getAddrssInfo() {
		return (ResponseEntity.ok(addressInfoDao.findAll()));
		
	}
	
	

}
