package com.example.demo.controller;

import java.io.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

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
	@RequestMapping("link3")
	public String method3() {
		System.out.println("link3 메소드 일함");
		// 1
		// 2
		// 3
		// 4 forward
		return "forward:/sub6/link2";
	}
	
	@RequestMapping("link4")
	public void method4(HttpServletRequest req, HttpServletResponse res) 
			throws Exception {
		
		System.out.println("link4 에서 일함");
		
		String view = "/WEB-INF/views/abc.jsp";
		req.getRequestDispatcher(view).forward(req, res);
	}
}








