package com.carl.umlclass.bean;

import java.util.Date;

public class Product {
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

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ ", producedDate=" + producedDate + "]";
	}

	public Product() {
		super();
	}

	public Product(Long id, String name, float price, Date producedDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.producedDate = producedDate;
	}

}
