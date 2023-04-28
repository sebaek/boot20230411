package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub27")
public class Controller27 {

	@Autowired
	private Mapper07 mapper;
	
	
	// 경로 : /sub27/link1?s=ell
	@GetMapping("link1")
	public String method1(Model model,
			@RequestParam(value = "s", defaultValue = "") String keyword) {
		
		model.addAttribute("customerList", mapper.sql1(keyword));
		
		return "/sub13/link1";
	}
	
	// 경로 : /sub27/link2?search=eve
	@GetMapping("link2")
	public String method2() {
		// search 리퀘스트 파라미터로 직원 lastName, firstName검색
		
		mapper.sql2();
		
		return "/sub13/link2"; // 직원 lastName, firstName
	}
}








