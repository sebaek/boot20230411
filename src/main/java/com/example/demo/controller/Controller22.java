package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub22")
public class Controller22 {

	@Autowired
	private Mapper03 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		int cnt1 = mapper.sql1(77, "java");
		int cnt2 = mapper.sql1(88, "spring");
		int cnt3 = mapper.sql1(99, "css");
		
		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
	}
	
	
	@RequestMapping("link2")
	public void method2() {
		System.out.println(mapper.sql2(7.987, "hello mybatis"));
		System.out.println(mapper.sql2(392742.283, "hi weekend"));
	}
	
	// /sub22/link3?val1=234.223&val2=송태섭
	@RequestMapping("link3")
	public void method3(Double val1, String val2) {
		System.out.println(mapper.sql2(val1, val2));
	}
	
	@RequestMapping("link4")
	public void method4() {
		Dto09 dto = new Dto09();
		dto.setProp1(300);
		dto.setProp2("hello mybatis");
		dto.setProp3(33.33);
		
		int cnt = mapper.sql3(dto);
		System.out.println(cnt);
	}
	
	@RequestMapping("link5")
	public void method5() {
		Dto10 dto = new Dto10();
		dto.setAge(333);
		dto.setName("spring");
		dto.setScore(99.99);
		
		int cnt = mapper.sql4(dto);
		System.out.println(cnt + "행 입력됨");
	}
	
	// /sub22/link6?age=77&name=park&score=88.88
	@RequestMapping("link6")
	public void method6(@ModelAttribute Dto10 dto) {
		int cnt = mapper.sql4(dto);
		System.out.println(cnt + "개 행 입력됨");
	}
	
	
	// MyTable36에 데이터 추가될 수 있게
	// 아래 코드 수정하기
	// /sub22/link7?prop1=33&prop2=world&prop3=33.44
	@RequestMapping("link7")
	public void method7(Dto09 dto) {
		int cnt = mapper.sql3(dto);
		System.out.println(cnt + "개 행 입력됨");
	}
	
	
	@RequestMapping("link8")
	public void method8() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		dto1.setProp1(345);
		dto2.setName("서태웅");
		dto1.setProp3(99.88);
		
		int cnt = mapper.sql5(dto1, dto2);
		System.out.println(cnt + "개 행 추가됨");
	}
	
	@RequestMapping("link9")
	public void method9() {
		Dto09 o1 = new Dto09();
		Dto10 o2 = new Dto10();
		
		o1.setProp1(12345);
		o1.setProp2("점심시간");
		o1.setProp3(88.77);
		
		o2.setAge(54321);
		o2.setName("돈까스");
		o2.setScore(77.88);
		
		int cnt = mapper.sql6(o1, o2);
		System.out.println(cnt + "개 행 입력완료");
	}
}















