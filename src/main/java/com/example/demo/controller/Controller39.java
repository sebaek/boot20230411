package com.example.demo.controller;

import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub39")
public class Controller39 {

	@GetMapping("view")
	public void view() {
		
	}
	
	@GetMapping("link1")
	@ResponseBody
	public String method1() {
		return "hello ajax";
	}
	
	@GetMapping("link2")
	@ResponseBody
	public ResponseEntity method2() {
		return ResponseEntity.badRequest().build();
	}
}








