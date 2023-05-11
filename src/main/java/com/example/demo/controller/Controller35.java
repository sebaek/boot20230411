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
	
	@PostMapping("link2")
	public void method2() {
		System.out.println("메소드2 일함!!");
	}
}











