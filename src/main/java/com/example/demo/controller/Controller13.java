package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub13")
public class Controller13 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;
	
	@RequestMapping("link1")
	public void method1(Model model) throws Exception {
		String sql = """
				SELECT CustomerID, CustomerName
				FROM Customers
				WHERE CustomerID < 4
				""";
		List<Customer> obj = new ArrayList<>();
		// 1.
		// 2.
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		try (con; stmt; rs;) {
			while (rs.next()) {
				int id = rs.getInt("customerId");
				String name = rs.getString("customerName");
				System.out.println(id + ":" + name); // 콘솔 출력
				
				Customer customer = new Customer();
				customer.setId(id);
				customer.setName(name);
				obj.add(customer);
			}
		}
		// 3. add attribute
		model.addAttribute("customerList", obj);
		// 4.
	}
	
	@RequestMapping("link2")
	public void method2(Model model) throws Exception {
		List<Employee> list = new ArrayList<>();
		String sql = """
				SELECT EmployeeId, 
				       LastName,
				       FirstName
				FROM Employees
				""";
		// 이 메소드 완성
		
		// Employee 클래스 작성
		// 프로퍼티 (id(int), lastName(string), firstName(string))
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		try (con; stmt; rs;) {
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt("employeeId"));
				employee.setFirstName(rs.getString("firstName"));
				employee.setLastName(rs.getString("lastName"));
				
				list.add(employee);
			}
			
		}
		
		model.addAttribute("employeeList", list);
		
		// jsp 작성
		
	}
}













