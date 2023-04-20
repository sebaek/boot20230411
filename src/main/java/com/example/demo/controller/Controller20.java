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

		System.out.println(mapper.method2());
	}

	@RequestMapping("link2")
	public void method2() {

		// Mapper01에 method3 작성

		// 1번 공급자의 공급자명 출력
		System.out.println(mapper.method3());
	}

	@RequestMapping("link3")
	public void method3() {
		String name = mapper.method4(5);
		System.out.println(name);
	}

	// link4?id=70
	@RequestMapping("link4")
	public void method4(
			@RequestParam("id") Integer customerId) {
		String name = mapper.method4(customerId);
		System.out.println(name);
	}
	
	// link5?id=2
	// 2번 직원의 lastName을 콘솔에 출력
	@RequestMapping("link5")
	public void metho5() {
		System.out.println(mapper.method5());
	}
	
}











