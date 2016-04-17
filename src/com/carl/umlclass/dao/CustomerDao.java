package com.carl.umlclass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.carl.umlclass.bean.Customer;
import com.carl.umlclass.common.jdbc.ConnectionFactory;

public class CustomerDao {
	/**
	 * @param customer
	 */
	public boolean save(Customer customer) {
		boolean tag = false;
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				conn = ConnectionFactory.getConnection();
				String sql = "insert into tb_customer(name,password,age,telephone) values(?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, customer.getName());
				pstmt.setString(2, customer.getPassword());
				pstmt.setInt(3, customer.getAge());
				pstmt.setString(4, customer.getTelephone());
				pstmt.executeUpdate();
				tag = true;
			} finally {
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tag;
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Customer findById(long id) {
		Customer customer = null;
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				conn = ConnectionFactory.getConnection();
				String sql = "select id,name,password,age,telephone from tb_customer where id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					customer = new Customer(rs.getInt(1), rs.getString(2),
							rs.getString(3), rs.getInt(4), rs.getString(5));
				}
			} finally {
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;
	}

	/**
	 * 
	 * @param customer
	 */
	public void update(Customer customer) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				conn = ConnectionFactory.getConnection();
				String sql = "update tb_customer set name=?,password=?,age=?,telephone=? where id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, customer.getName());
				pstmt.setString(2, customer.getPassword());
				pstmt.setInt(3, customer.getAge());
				pstmt.setString(4, customer.getTelephone());
				pstmt.setLong(5, customer.getId());
				pstmt.executeUpdate();
			} finally {
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param id
	 */
	public void deleteById(long id) {
		Customer customer = null;
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				conn = ConnectionFactory.getConnection();
				String sql = "delete from tb_customer where id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				pstmt.executeUpdate();
			} finally {
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
