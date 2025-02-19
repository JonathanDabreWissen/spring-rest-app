package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(path="/", produces ="text/html")
	public String abc() {
		return "<html><body><h1>Welcome to REST API Application</h1><hr></hr><h3>Thank You</h3></body></html>";
	}
	
	@GetMapping("/greet")
	public String xyz() {
		return "<h2>Have a good day:) :GET</h2>";
	}
	
	@PostMapping("/greet")
	public String xyz2() {
		return "<h2>Have a great day ahead :POST</h2>";
	}
	
	@PutMapping("/greet")
	public String xyz3() {
		return "<h2>Have a great day ahead :PUT</h2>";
	}
	
	@PatchMapping("/greet")
	public String xyz4() {
		return "<h2>Have a great day ahead :PATCH</h2>";
	}
	
	@DeleteMapping("/greet")
	public String xyz5() {
		return "<h2>Have a great day ahead :DELETE</h2>";
	}
}
