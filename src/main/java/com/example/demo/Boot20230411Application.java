package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;

import com.example.demo.domain.*;

@SpringBootApplication
public class Boot20230411Application {

	public static void main(String[] args) {
		// Spring Beans : 스프링이 관리하는 객체들
		ApplicationContext context = SpringApplication.run(Boot20230411Application.class, args);
		Object o = context.getBean("bean1");
		System.out.println(o);
		
		Object o2 = context.getBean("employee");
		Object o3 = context.getBean("employee");
		System.out.println(o2);
		
		System.out.println(System.identityHashCode(o2));
		System.out.println(System.identityHashCode(o3));
	}

	// 우리가 객체를 직접 만들 때
	public void legacy() {
		Object o = new Object(); // 직접 만든 객체
		Employee e = new Employee(); // 직접 만든 객체
		
		e.setId(100); // 프로퍼티 직접 할당
	}
}







