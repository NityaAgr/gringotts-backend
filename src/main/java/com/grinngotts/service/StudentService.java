package com.grinngotts.service;

import org.springframework.stereotype.Service;

import com.grinngotts.dto.SegmentDTO;

@Service
public class StudentService {
	public SegmentDTO getAllSegments() {
		SegmentDTO seg = new SegmentDTO(1, "Test");
		return seg;	
	}
}
