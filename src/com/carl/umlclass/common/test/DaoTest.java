package com.carl.umlclass.common.test;

import com.carl.umlclass.bean.Customer;
import com.carl.umlclass.dao.CustomerDao;

public class DaoTest {
	public static void main(String[] args) {
		CustomerDao customerDao = new CustomerDao();
		// customerDao.save(new Customer(null, "李四", "123321", 12,
		// "18898761234"));
		Customer customer = customerDao.findById(2);
		System.out.println(customer);
		customer.setAge(20);
		//customerDao.update(customer);
		customerDao.deleteById(2);
	}

}
