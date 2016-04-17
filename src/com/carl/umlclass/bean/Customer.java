package com.carl.umlclass.bean;

public class Customer {
	private Integer id;
	private String name;
	private String password;
	private Integer age;
	private String telephone;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String name, String password, Integer age,
			String telephone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.telephone = telephone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password="
				+ password + ", age=" + age + ", telephone=" + telephone + "]";
	}
	
}
