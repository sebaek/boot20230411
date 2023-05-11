package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;

@Controller
@RequestMapping("sub36")
public class Controller36 {

	@GetMapping("view")
	public void method() {
		
	}
	
	@Data
	static class Dto1 {
		private String name;
		private Integer age;
	}
	
	// {"name": "정대만", "age": 40}
	@PostMapping("link1")
	public void method1(@RequestBody Dto1 map) {
		System.out.println(map);
	}
}



















