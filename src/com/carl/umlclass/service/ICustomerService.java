package com.carl.umlclass.service;

import com.carl.umlclass.bean.Customer;
import com.carl.umlclass.common.exception.ServiceException;

public interface ICustomerService {
	/**
	 * customer登录业务路基处理接口标准
	 * @param name
	 * @param password
	 * @return
	 */
	Customer login(String name, String password) throws ServiceException;
	/**
	 * customer注册业务逻辑处理接口标准
	 * @param customer
	 */
	boolean register(Customer customer);
}
