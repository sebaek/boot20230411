package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Mapper02 {

	@Select("""
			SELECT CustomerName FROM Customers
			""")
	List<String> sql1();
}





