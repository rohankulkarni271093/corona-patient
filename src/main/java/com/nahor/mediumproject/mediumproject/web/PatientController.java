package com.nahor.mediumproject.mediumproject.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	
	@GetMapping("/")
	public String sampleCall() {
		return "Hello from the controller";
	}

}
