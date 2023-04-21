package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub24")
public class Controller24 {

	@Autowired
	private Mapper05 mapper;
	
	@RequestMapping("link1")
	public void method1( ) {
		int cnt = mapper.sql1();
		System.out.println(cnt + "개 행 수정됨");
	}
	
	@RequestMapping("link2")
	public void method2() {
		int cnt = mapper.sql2(6, "마이바티스", 98765);
		System.out.println(cnt + "개 행 변경됨");
	}
	
	@RequestMapping("link3")
	public void method3() {
		// 10번 고객 이름과 국가가 변경 되도록
		// mapper에 sql3 메소드 작성
		int cnt = mapper.sql3(10, "새로운 고객명", "대한민국");
		System.out.println(cnt + "개 행 변경됨");
	}
	
}










