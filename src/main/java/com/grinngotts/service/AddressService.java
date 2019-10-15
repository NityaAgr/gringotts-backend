package com.grinngotts.service;

import org.springframework.stereotype.Service;

import com.grinngotts.dto.AddressDTO;

@Service
public class AddressService {
public AddressDTO getAllAddresses() {
	// TODO Auto-generated method stub
	AddressDTO address = new AddressDTO(2, "Test");
	return address;	
}
}