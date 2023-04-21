package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub21")
public class Controller21 {

	@Autowired
	private Mapper02 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		/*
		String sql = """
				SELECT CustomerName FROM Customers
				""";
		*/
		List<String> list = mapper.sql1();
		/*
		List<String> list = new ArrayList<>();
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			list.add(rs.getString(1));
		}
		*/
//		System.out.println(list);
		list.forEach(System.out::println);
	}
	
	// 경로 : /sub21/link2
	// 모든 직원의 lastName 출력
	@RequestMapping("link2")
	public void method2() {
		List<String> names = mapper.sql2();
		names.forEach(System.out::println);
	}
}


















