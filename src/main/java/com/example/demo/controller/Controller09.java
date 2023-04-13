package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub9")
public class Controller09 {

	@RequestMapping("link1")
	public String method01(HttpServletRequest req, Model model) {
		// 1. request parameter 수집/가공
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		
		Dto04 obj = new Dto04();
		obj.setName(name);
		obj.setAge(age);
		
		// 2. business logic
		
		// 3. add attribute
		model.addAttribute("value", obj);
		
		// 4. forward / redirect
		// /WEB-INF/views/sub9/link1.jsp  로 포워드
		return "/sub9/link1"; 
	}
}









