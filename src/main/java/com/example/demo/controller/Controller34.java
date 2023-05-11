package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub34")
public class Controller34 {
	
	@GetMapping("ajax1")
	public void ajax1() {
		
	}

	@GetMapping("link1")
	@ResponseBody
	public String method1() {
		System.out.println("헬로 ajax");
		
		return "첫번째 응답 데이터";
	}
	
	@GetMapping("link2")
	public void method2() {
		System.out.println("get 요청 link2");
	}
	
	@GetMapping("link3")
	public void method3(@RequestParam("name") String name) {
		System.out.println("link3 메소드 일함");
		System.out.println("name:" + name);
	}
	
	@GetMapping("link4")
	public void method4(String address) {
		System.out.println("link4 메소드 일함");
		System.out.println("address:" + address);
	}
}












