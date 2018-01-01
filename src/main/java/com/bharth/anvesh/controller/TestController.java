package com.bharth.anvesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharth.anvesh.model.Circle;
import com.bharth.anvesh.service.SparePartsService;

@RestController
public class TestController {
	@Autowired
	SparePartsService sparePartsService; 
	
	Circle circle=new Circle();
	@RequestMapping("/test")
	public String test() {
		circle.x="1";
		circle.y="2";
		circle.r="3";
		return sparePartsService.test(circle);
		
		
	}
}
