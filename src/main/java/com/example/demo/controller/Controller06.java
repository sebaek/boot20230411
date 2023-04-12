package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub6")
public class Controller06 {

	@RequestMapping("link1")
	public String method1() {
		System.out.println("link1 메소드 일함");
		return "forward:/sub6/link2";
	}
	
	@RequestMapping("link2")
	public void method2() {
		System.out.println("link2 메소드 일함");
	}
	
	// 경로 : /sub6/link3
	// method3 작성
	// forward /sub6/link2
}








