package com.carl.umlclass.web;

import java.util.Date;

import com.carl.umlclass.bean.Product;
import com.carl.umlclass.service.impl.ProductServiceImpl;

public class ProductAction {
	private ProductServiceImpl productServiceImpl = new ProductServiceImpl();

	private Long id;
	private String name;
	private float price;
	private Date producedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getProducedDate() {
		return producedDate;
	}

	public void setProducedDate(Date producedDate) {
		this.producedDate = producedDate;
	}

	public String execute() {
		Product product = new Product(null, name, price, producedDate);
		productServiceImpl.addProduct(product);
		return "success";
	}
}
