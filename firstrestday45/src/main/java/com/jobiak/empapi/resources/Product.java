package com.jobiak.empapi.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/catalog")
public class Product {
	
	@GetMapping("/mobile")
	public String showCatalog() {
		
		return new String("Samsung E2FH, Dual Camera, 32GB Memory, 49,999, I Got You");
		
	}

	@GetMapping("/intro")
	public String showIntroduction() {
		
		return new String("The #1 Manufacturer of Digital Mobiles in Asia");
		
	}
	
	@GetMapping("/search/{modelId}")
	public String searchModel(@PathVariable(value = "modelId")String modelId) {
		
		return new String(modelId +" is available only in blue and black colours, can be delivered in 24 hours");
		
	}
}
