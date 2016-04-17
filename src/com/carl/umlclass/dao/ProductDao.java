package com.carl.umlclass.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.carl.umlclass.bean.Customer;
import com.carl.umlclass.bean.Product;
import com.carl.umlclass.common.jdbc.ConnectionFactory;

public class ProductDao {
	/**
	 * 添加商品
	 * 
	 * @param product
	 */
	public void addProduct(Product product) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				conn = ConnectionFactory.getConnection();
				String sql = "insert into tb_product(name,price,producedDate) values(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, product.getName());
				pstmt.setFloat(2, product.getPrice());
				pstmt.setDate(3, new Date(product.getProducedDate().getTime()));
				pstmt.executeUpdate();
			} finally {
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateProduct(Product product) {

	}

	public Product queryProduct(long productId) {
		Product product = null;
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				conn = ConnectionFactory.getConnection();
				String sql = "select id,name,price,producedDate from tb_product where id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, productId);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					product = new Product(rs.getLong(1), rs.getString(2),
							rs.getFloat(3), rs.getDate(4));
				}
			} finally {
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}
}
