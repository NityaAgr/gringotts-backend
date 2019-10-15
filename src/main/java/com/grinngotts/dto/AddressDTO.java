package com.grinngotts.dto;

public class AddressDTO {

/**
* /dto/SegmentDTO.java
**/
	public AddressDTO(Integer address_id, String zip_code) {
		this.setaddress_id(address_id);
		this.setsetzip_code(zip_code);
	}

	public Integer getaddress_id() {
		return getaddress_id();
	}
	public void setaddress_id(Integer address_id) {
		this.address_id = address_id;
	}

	public String getsetzip_code() {
		return zip_code;
	}

	public void setsetzip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	private Integer address_id;
	private String zip_code;
}
