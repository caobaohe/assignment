package com.carl.umlclass.common.test;

import com.carl.umlclass.bean.Customer;
import com.carl.umlclass.service.ICustomerService;
import com.carl.umlclass.service.impl.CustomerServiceImpl;

public class ServiceTest {
	public static void main(String[] args) {
		ICustomerService customerService = new CustomerServiceImpl();
		customerService.register(new Customer(null, "李四", "123321", 12, "18898761234"));
	}
}
