package com.carl.umlclass.common.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;

	static {
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://127.0.0.1:3306/db_umlclass";
		user = "root";
		password = "";
	}

	public static Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName(driver);
		return DriverManager.getConnection(url, user, password);
	}

	public static void close(ResultSet rs, Statement stmt, Connection conn)
			throws SQLException {
		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}
	}
}
