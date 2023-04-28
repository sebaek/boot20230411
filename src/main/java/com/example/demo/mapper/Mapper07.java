package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper07 {

	@Select("""
			<script>
			<bind name="pattern" value="'%' + keyword + '%'" />
			
			SELECT 
				customerId id,
				customerName name,
				contactName,
				address
			FROM
				Customers
			WHERE
				CustomerName LIKE #{pattern}
			ORDER BY id DESC
			</script>
			""")
	List<Customer> sql1(String keyword);

	@Select("""
			<script>
			<bind name="p" value="'%' + s + '%'" />
			
			SELECT
				EmployeeId id,
				FirstName,
				LastName
			FROM
				Employees
			WHERE
				FirstName LIKE #{p}
				OR LastName LIKE #{p}
			ORDER BY id DESC
			</script>
			""")
	List<Employee> sql2(String s);
}







