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

	@Select("""
			SELECT SupplierName
			FROM Suppliers
			WHERE SupplierID = 1
			""")
	String method3();
	
	@Select("""
			SELECT CustomerName
			FROM Customers
			WHERE CustomerID = #{id}
			""")
	String method4(Integer id);
	
	
	@Select("""
			SELECT LastName
			FROM Employees
			WHERE EmployeeId = #{id}
			""")
	String method5(Integer id);
	
	@Select("""
			SELECT Price
			FROM MyTable33
			LIMIT 1
			""")
	Integer method6();
}







