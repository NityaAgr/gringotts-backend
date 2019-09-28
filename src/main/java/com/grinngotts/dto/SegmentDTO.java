package com.grinngotts.dto;

/**
* /dto/SegmentDTO.java
**/
public class SegmentDTO {
	public SegmentDTO(Integer id, String name) {
		this.setId(id);
		this.setName(name);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Integer id;
	private String name;
}
