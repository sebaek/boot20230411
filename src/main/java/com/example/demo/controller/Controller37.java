package com.example.demo.controller;

import java.time.*;
import java.util.*;

import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub37")
public class Controller37 {

	@GetMapping("view")
	public void view() {
		
	}
	
	
	// @ResponseBody
	// ResponseEntity<B>
	
	@GetMapping("link1")
	public ResponseEntity mehtod1() {
		ResponseEntity res = new ResponseEntity(HttpStatusCode.valueOf(500));
		return res;
	}
	
	@GetMapping("link2")
	public ResponseEntity method2() {
		ResponseEntity res = ResponseEntity.ok().build();
		return res;
		
	}
	
	@GetMapping("link3")
	public ResponseEntity method3() {
		ResponseEntity res = ResponseEntity.notFound().build();
		return res;
	}
	
	@GetMapping("link4")
	public ResponseEntity method4() {
		
		HttpHeaders header = new HttpHeaders();
		header.add("my-header1", "my-value1");
		header.add("my-header2", "my-value2");
		
		ResponseEntity res = new ResponseEntity(header, HttpStatusCode.valueOf(200));
		
		return res;
	}
	
	@GetMapping("link5")
	public ResponseEntity<String> method5() {
		
		ResponseEntity<String> res = new ResponseEntity<>("hello response", HttpStatusCode.valueOf(200));
		
		return res;
	}
	
	@GetMapping("link6")
	public ResponseEntity<String> method6() {
		
		return ResponseEntity.ok("hello response 2222");
	}
	
	@GetMapping("link7")
	public ResponseEntity<String> method7() {
		String date = LocalDate.now().toString();
		
		return ResponseEntity.ok(date);
	}
	
	@GetMapping("link8")
	@ResponseBody
	public String method8() {
		
		String dateTime = LocalDateTime.now().toString();
		
		return dateTime;
	}
	
	@GetMapping("link9")
	@ResponseBody
	public String method9() {
		return LocalTime.now().toString();
	}
	
	@GetMapping("link10")
	@ResponseBody
	public String method10() {
		String data = """
				{"name": "lee", "age": 30}
				""";
		
		return data;
	}
	
	@GetMapping("link11")
	public ResponseEntity method11() {
		String data = """
				{"name": "lee", "age": 30}
				""";
		
		HttpHeaders header = new HttpHeaders();
		header.set("Content-Type", "application/json");
		
		return new ResponseEntity(data, header, 200);
	}
	
	@GetMapping("link12")
	@ResponseBody 
	// + 리턴타입 : Map, JavaBean 이면 json string 변환
	// AND Content-Type : application/json 로 셋팅
	public Map method12() {
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "박지성");
		map.put("age", 44);
		
		return map;
	}
	
	@GetMapping("link13")
	@ResponseBody
	public Map<String, Object> method13() {
		var map = new HashMap<String, Object>();
		
		map.put("address", "seoul");
		map.put("price", 3.14);
		
		return map;
	}
}














