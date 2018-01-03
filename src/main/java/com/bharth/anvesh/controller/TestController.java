package com.bharth.anvesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bharth.anvesh.model.Circle;
import com.bharth.anvesh.service.SparePartsService;

@RestController
public class TestController {
	@Autowired
	SparePartsService sparePartsService; 
	
	@PostMapping("/test")
	public String test(@RequestBody Circle circle) {
		return sparePartsService.test(circle);
	}
}
