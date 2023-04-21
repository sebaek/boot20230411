package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Mapper03 {

	@Insert("""
			INSERT INTO MyTable34 (Col1, Col2)
			VALUES (#{val1}, #{val2})
			""")
	int sql1(Integer val1, String val2);
	
	@Insert("""
			INSERT INTO MyTable35 (Col1, Col2)
			VALUES (#{v1}, #{v2})
			""")
	int sql2(Double v1, String v2);
	// MyTable35 만들기
	// controller22.method2에서 mapper03.sql2 메소드 호출
}










