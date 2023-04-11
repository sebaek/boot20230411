package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub4")
public class Controller04 {
	// method argument(parameter)

	// 경로 : /sub4/link1?name=손&age=30
	@RequestMapping("link1")
	public void method01(HttpServletRequest request) {
		// 1. request parameter 수집/가공
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		
		// 2. business logic
		
		// 3. add attribute
		
		// 4. forward/redirect
	}
}






