package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub35")
public class Controller35 {
	
	@GetMapping("ajax1")
	public void view() {
		
	}
	
	@PostMapping("link1")
	public void method1() {
		System.out.println("포스트 요청 잘 받음");
	}
}











