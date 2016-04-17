package com.carl.umlclass.common.test;

import java.util.Date;

import com.carl.umlclass.bean.Customer;
import com.carl.umlclass.bean.Product;
import com.carl.umlclass.dao.CustomerDao;
import com.carl.umlclass.dao.ProductDao;

public class DaoTest {
	public static void main(String[] args) {
		//CustomerDao customerDao = new CustomerDao();
		// customerDao.save(new Customer(null, "李四", "123321", 12,
		// "18898761234"));
		//Customer customer = customerDao.findById(2);
		//System.out.println(customer);
		//customer.setAge(20);
		//customerDao.update(customer);
		//customerDao.deleteById(2);
		
		ProductDao productDao = new ProductDao();
		Product product = new Product(null,"康师傅老坛酸菜牛肉面", 4.5f, new Date());
		productDao.addProduct(product);
		
		System.out.println(productDao.queryProduct(1));
	}

}
