package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Mapper05 {

	@Update("""
			UPDATE MyTable39
			SET 
				Col2 = '수정된 값',
				Col3 = 99999
			""")
	int sql1();
	
	@Update("""
			UPDATE MyTable39
			SET 
				Col2 = #{val1},
				Col3 = #{val2}
			WHERE 
				Col1 = #{key}
			""")
	int sql2(Integer key, String val1, Integer val2);
}




