package com.carl.umlclass.service.impl;

import com.carl.umlclass.bean.Customer;
import com.carl.umlclass.common.exception.ServiceException;
import com.carl.umlclass.common.util.MD5;
import com.carl.umlclass.dao.CustomerDao;
import com.carl.umlclass.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {
	private CustomerDao customerDao;

	public CustomerServiceImpl() {
		customerDao = new CustomerDao();
	}
	@Override
	public Customer login(String name, String password) throws ServiceException {
		
		return null;
	}

	@Override
	public boolean register(Customer customer) {
		customer.setPassword(MD5.getMD5Str(customer.getPassword()));
		return customerDao.save(customer);
	}

}
