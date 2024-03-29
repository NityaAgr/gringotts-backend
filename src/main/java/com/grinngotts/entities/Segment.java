package com.grinngotts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
* /entities/User.java
**/
@Entity
@Table(name = "segment")
public class Segment {
	@Id
	private Integer segment_id;
	
	@Column(nullable = false)
	private String name;
	
	@ManyToMany(mappedBy = "segments")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
