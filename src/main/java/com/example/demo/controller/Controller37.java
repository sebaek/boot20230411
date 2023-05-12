package com.example.demo.controller;

import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub37")
public class Controller37 {

	@GetMapping("view")
	public void view() {
		
	}
	
	
	// @ResponseBody
	// ResponseEntity<B>
	
	@GetMapping("link1")
	public ResponseEntity mehtod1() {
		ResponseEntity res = new ResponseEntity(HttpStatusCode.valueOf(500));
		return res;
	}
	
	@GetMapping("link2")
	public ResponseEntity method2() {
		ResponseEntity res = ResponseEntity.ok().build();
		return res;
		
	}
	
	@GetMapping("link3")
	public ResponseEntity method3() {
		ResponseEntity res = ResponseEntity.notFound().build();
		return res;
	}
	
	@GetMapping("link4")
	public ResponseEntity method4() {
		
		HttpHeaders header = new HttpHeaders();
		header.add("my-header1", "my-value1");
		header.add("my-header2", "my-value2");
		
		ResponseEntity res = new ResponseEntity(header, HttpStatusCode.valueOf(200));
		
		return res;
	}
}














