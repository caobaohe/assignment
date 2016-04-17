package com.carl.umlclass.common.test;

import java.sql.Connection;

import com.carl.umlclass.common.jdbc.ConnectionFactory;

public class ConnTest {
	public static void main(String[] args) {
		try {
			Connection conn = ConnectionFactory.getConnection();
			System.out.println(conn);
			// 注册驱动
			// 获取连接
			// 创建PSTMT
			// 执行sql
			// 如果有结果集，处理结果集
			// 释放资源
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
