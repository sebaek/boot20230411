package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub19")
public class Controller19 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1() throws Exception {
		String sql = """
				INSERT INTO MyTable30 (Col1, Col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, 99);
			pstmt.setString(2, "hello");
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	@RequestMapping("link2")
	public void method2() throws Exception {
		String sql = """
				INSERT INTO MyTable30 (Col1, Col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
//			pstmt.setInt(1, 99);
//			pstmt.setString(2, "hello");
			pstmt.setString(1, "888");
			pstmt.setInt(2, 12345);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	@RequestMapping("link3")
	public void method3() throws Exception {
		String sql = """
				INSERT INTO MyTable31 (Col1, Col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, "1923-03-01");
			pstmt.setString(2, "1811-11-12 23:50:49");

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	@RequestMapping("link4")
	public void method4() throws Exception {
		String sql = """
				INSERT INTO MyTable31 (Col1, Col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
//			pstmt.setString(1, "1923-03-01");
//			pstmt.setString(2, "1811-11-12 23:50:49");
			pstmt.setDate(1, Date.valueOf("2023-03-01"));
			pstmt.setTimestamp(2, Timestamp.valueOf("2000-01-01 22:22:11"));

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	// 경로 /sub19/link5
	// MyTable32에 새 레코드 추가하는 메소드 완성
	@RequestMapping("link5")
	public void method5() throws Exception {
		String sql = """
				INSERT INTO MyTable32 (Name, Age, Price, Birth, Inserted)
				VALUES (?, ?, ?, ?, ?)
				""";

		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, "박지성");
			pstmt.setInt(2, 40);
			pstmt.setDouble(3, 3.14);
			pstmt.setDate(4, Date.valueOf("1999-01-01"));
			pstmt.setTimestamp(5, Timestamp.valueOf("1980-12-31 12:12:12"));
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력완료");
			
			
		}
	}
	
	@RequestMapping("link6")
	public void method6() {
		// forward to form
		// /WEB-INF/views/sub19/link6.jsp
	}
	
	@RequestMapping("link7")
	public void method7() {
		
	}
}









