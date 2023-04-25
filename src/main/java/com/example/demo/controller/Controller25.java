package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub25")
public class Controller25 {

	@RequestMapping(value = "link1", method = RequestMethod.POST)
	public void method1() {
		System.out.println("/sub25/link1 에서 메소드 일함");
	}
	
	// @RequestMapping(value = "link2", method = RequestMethod.GET)
	@GetMapping("link2")
	public void method2() {
		System.out.println("/sub25/link2 GET 에서 메소드 일함");
	}
	
	// @RequestMappin(value = "link3", method = RequestMethod.POST)
	@PostMapping("link3")
	public void method3() {
		System.out.println("/sub25/link3 POST 에서 메소드 일함");
	}
	
	// /sub25/link4/abc
	// /sub25/link4/def
	@GetMapping("link4/{var1}")
	public void method4(@PathVariable("var1") String p1) {
		System.out.println("var1:" + p1);
	}
	
	// /sub25/link5/abc/55
	// /sub25/link5/def/77
	@GetMapping("link5/{id}/{age}")
	public void method5(@PathVariable("id") String id,
			@PathVariable("age") int age) {
		System.out.println(id + ", " + age);
	}
	
	// /sub25/link6/id/3/name/son
	// /sub25/link6/id/7/name/park
	@GetMapping("link6/id/{var1}/name/{var2}")
	public void method6(@PathVariable("var1") String id,
			@PathVariable("var2") String name) {
		System.out.println(id + ", " + name);
	}
	
}
















