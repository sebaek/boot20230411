package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controller01 {

	@RequestMapping("/sub1/link1")
	public void method01() {
		System.out.println("일함!@!@!@!@!@");
	}
}
