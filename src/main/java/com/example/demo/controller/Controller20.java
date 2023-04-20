package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub20")
public class Controller20 {
	
	@Autowired
	private Mapper01 mapper;

	@RequestMapping("link1")
	public void method1() {
		String name = mapper.method1();
		System.out.println(name);
	}
}






