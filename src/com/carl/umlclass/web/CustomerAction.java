package com.carl.umlclass.web;

import com.carl.umlclass.bean.Customer;
import com.carl.umlclass.service.ICustomerService;
import com.carl.umlclass.service.impl.CustomerServiceImpl;

public class CustomerAction {
	private String name;
	private String password;
	private Integer age;
	private String telephone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	// 关联service
	public ICustomerService customerService = new CustomerServiceImpl();

	public String login() {
		return null;
	}

	public String register() {
		String tag = "failure";
		if (customerService.register(new Customer(null, name, password, age,
				telephone))) {
			tag = "success";
		}
		return tag;
	}
}
