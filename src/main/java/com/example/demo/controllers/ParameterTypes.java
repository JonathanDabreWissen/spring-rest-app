package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Person;

@RestController
public class ParameterTypes {
	
	@GetMapping("/query")
	public String queryParameterDemo(@RequestParam("user") String name, int age) {
		System.out.println("********Query Parameter******");
		System.out.println(" Name : " +name);
		System.out.println(" Age : " +age);
		return "Welcome! " +name +" and you are " +age +" years old";
	}
	@GetMapping("/path/{name}/{age}")
	public String pathParamDemo(@PathVariable String name, @PathVariable int age) {
		System.out.println("********Path Parameter******");
		System.out.println(" Name : " +name);
		System.out.println(" Age : " +age);
		return "Welcome! " +name +" and you are " +age +" years old";
	}
	
	@GetMapping("/body")
	public String bodyParameter(@RequestBody Person p) {
		System.out.println("********Body Parameter******");
		System.out.println(" Name : " +p.getName());
		System.out.println(" Age : " +p.getAge());
		return "Welcome! " +p.getName() +" and you are " +p.getAge() +" years old";
	}
}
