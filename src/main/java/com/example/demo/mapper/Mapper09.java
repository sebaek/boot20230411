package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Mapper09 {

	@Select("""
			<script>
				SELECT COUNT(*)
				FROM Customers
				WHERE country IN (
				
				<foreach collection="elems" item="elem" separator=", ">
					#{elem}
				</foreach>
				
				)
			</script>
			""")
	Integer sql1(List<String> elems);
}





