package com.grinngotts.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grinngotts.dto.AddressDTO;
import com.grinngotts.service.AddressService;

/**
* /controllers/SegmentController.java
**/
@RestController
@RequestMapping("/api/segment")
@CrossOrigin
public class AddressController{
//	@Autowired
	AddressService Address_service = new AddressService();
	 
//	@RequestMapping(value="/api/segment/get/all", method=RequestMethod.GET, produces="application/json" 
	@GetMapping("/get/all")
	public ResponseEntity<AddressDTO> getAll() {
		AddressDTO address = Address_service.getAllAddresses();
		return new ResponseEntity<>(address, HttpStatus.OK);
	}
}

