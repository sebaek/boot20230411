package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub15")
public class Controller15 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1() throws Exception {
		// 새 고객데이터 추가
		String sql = """
				INSERT INTO Customers (CustomerID, CustomerName, City)
				VALUES (93, '서태웅', '부산')
				""";

		// INSERT, UPDATE, DELETE는
		// Statement의 executeUpdate 메소드 사용
		// 리턴값은 영향을 미친 레코드 수

		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		int count = stmt.executeUpdate(sql);

		try (con; stmt;) {

		}

		System.out.println(count + "개 행 추가됨");

	}

	// 경로: /sub15/link2
	// 10번째 직원 추가
	// 컬럼 : EmployeeID, LastName, FirstName
	@RequestMapping("link2")
	public void method2() throws Exception {
		String sql = """
				INSERT INTO Employees (EmployeeID, LastName, FirstName)
				VALUES
				(10, '손흥민', 'son')
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();) {
			int count = stmt.executeUpdate(sql);
			System.out.println(count + "개 행이 추가됨");
		}
	}

}
