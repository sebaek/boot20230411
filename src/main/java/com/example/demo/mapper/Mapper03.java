package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper03 {

	@Insert("""
			INSERT INTO MyTable34 (Col1, Col2)
			VALUES (#{val1}, #{val2})
			""")
	int sql1(Integer val1, String val2);
	
	// MyTable35 만들기
	// controller22.method2에서 mapper03.sql2 메소드 호출
	@Insert("""
			INSERT INTO MyTable35 (Col1, Col2)
			VALUES (#{v1}, #{v2})
			""")
	int sql2(Double v1, String v2);
	
	
	// 파라미터 1개일 때
	// 프로퍼티명만 작성
	@Insert("""
			INSERT INTO MyTable36 (Col1, Col2, Col3)
			VALUES (#{prop1}, #{prop2}, #{prop3})
			""")
	int sql3(Dto09 dto);
	
	
	// 1)MyTable37 테이블 만들기
	// 2)Dto10 자바빈 만들기
	// 3)mapper03.sql4 메소드를 controller22.method5에서 호출
	@Insert("""
			INSERT INTO MyTable37 (Age, Name, Score)
			VALUES (#{age}, #{name}, #{score}
			""")
	int sql4(Dto10 dto);
	
	
	
	
	
	
	
	
	
}










