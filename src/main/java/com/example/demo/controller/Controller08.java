package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub8")
public class Controller08 {

	@RequestMapping("link1")
	public String method1(@ModelAttribute("val") Dto04 dto04) {
		
		dto04.setName("채소연");
		dto04.setAge(22);
		
		return "/sub7/link10";
	}
	
	@RequestMapping("link2")
	public void method2(@ModelAttribute("product") Dto02 obj) {
		obj.setCompany("apple");
		obj.setModel("ipad");
		obj.setPrice(300);
		
	}
}







