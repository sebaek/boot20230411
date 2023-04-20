package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Mapper01 {
	
	@Select("""
			SELECT CustomerName
			FROM Customers
			WHERE CustomerID = 1
			""")
	String method1();
	
	@Select("""
			SELECT FirstName
			FROM Employees
			WHERE EmployeeId = 1
			""")
	String method2();
}







