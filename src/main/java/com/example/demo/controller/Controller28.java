package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub28")
public class Controller28 {

	@Autowired
	private Mapper09 mapper;
	
	@GetMapping("link1")
	public void method1() {
		mapper.sql1(List.of("UK", "USA"));
	}
	
	@GetMapping("link2")
	public void method2() {
		List<Supplier> list1 = mapper.sql2(List.of("UK", "USA", "Japan"));
		list1.forEach(System.out::print);
		
		List<Supplier> list2 = mapper.sql2(List.of("Brazil", "Germany"));
		list2.forEach(System.out::print);
	}
}










