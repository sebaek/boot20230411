package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

@Controller
@RequestMapping("sub29")
public class Controller29 {

	// 경로 : /sub29/link1?name=son&age=33
	@GetMapping("link1")
	public void method1() {
		// /sub29/link1.jsp
	}
	
	// 
	@PostMapping("link2")
	public void method2(@RequestParam("myfile") MultipartFile file) {
		
	}
}






