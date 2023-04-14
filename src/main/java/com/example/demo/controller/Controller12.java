package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub12")
public class Controller12 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1() {
		String sql = """
				SELECT LastName FROM Employees
				""";
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {
				System.out.println(rs.next()); // true
				String name1 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next()); // true
				String name2 = rs.getString("lastName");
				System.out.println(name2);

				System.out.println(rs.next()); // true
				String name3 = rs.getString("lastName");
				System.out.println(name3);

				System.out.println(rs.next()); // true
				String name4 = rs.getString("lastName");
				System.out.println(name4);

				System.out.println(rs.next()); // true
				String name5 = rs.getString("lastName");
				System.out.println(name5);

				System.out.println(rs.next()); // true
				String name6 = rs.getString("lastName");
				System.out.println(name6);

				System.out.println(rs.next()); // true
				String name7 = rs.getString("lastName");
				System.out.println(name7);

				System.out.println(rs.next()); // true
				String name8 = rs.getString("lastName");
				System.out.println(name8);

				System.out.println(rs.next()); // true
				String name9 = rs.getString("lastName");
				System.out.println(name9);

				System.out.println(rs.next()); // false

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("link2")
	public void method2() {
		String sql = """
				SELECT LastName FROM Employees
				""";
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {
				while (rs.next()) {
					System.out.println(rs.getString("lastName"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// SELECT ShipperName FROM Shippers;
	// 경로 : link3
	@RequestMapping("link3")
	public void method3() {
		String sql = "SELECT ShipperName FROM Shippers";

		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs) {
				while (rs.next()) {
					System.out.println(rs.getString("ShipperName"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
