package com.grinngotts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grinngotts.dto.SegmentDTO;
import com.grinngotts.service.SegmentService;

/**
* /controllers/SegmentController.java
**/
@RestController
@RequestMapping("/api/segment")
@CrossOrigin
public class SegmentController {
//	@Autowired
	SegmentService service = new SegmentService();
	 
//	@RequestMapping(value="/api/segment/get/all", method=RequestMethod.GET, produces="application/json" 
	@GetMapping("/get/all")
	public ResponseEntity<SegmentDTO> getAll() {
		SegmentDTO segment = service.getAllSegments();
		return new ResponseEntity<>(segment, HttpStatus.OK);
	}
}
