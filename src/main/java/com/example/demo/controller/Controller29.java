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
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
	}
	
	@GetMapping("link3")
	public void method3() {
		// 파일 Input이 있는 form을 포함한 뷰(link3.jsp)로 포워드
	}
	
	@PostMapping("link4")
	public void metho4(@RequestParam("files") MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
	}
	
	
}













