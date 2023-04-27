package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub26")
public class Controller26 {

	@Autowired
	private Mapper06 mapper;

	// 경로 : /sub26/link1?page=3 -> 3페이지
	// 경로 : /sub26/link1?page=1 -> 1페이지
	// 경로 : /sub26/link1 -> 1페이지
	@GetMapping("link1")
	public String method1(@RequestParam(value = "page", defaultValue = "1") Integer page, Model model) {
		System.out.println(page);

		// 쿼리에서 사용하는 시작 인덱스
		Integer startIndex = (page - 1) * 20;
		
		// 페이지네이션 가장 왼쪽번호, 오른쪽번호 구하기
		Integer leftPageNumber = (page - 1) / 10 * 10 + 1;
		Integer rightPageNumber = leftPageNumber + 9;

		List<Customer> list = mapper.listCustomer(startIndex);

		model.addAttribute("customerList", list);
		model.addAttribute("leftPageNumber", leftPageNumber);
		model.addAttribute("rightPageNumber", rightPageNumber);

		return "/sub13/link1";
	}
}





