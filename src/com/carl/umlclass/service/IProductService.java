package com.carl.umlclass.service;

import com.carl.umlclass.bean.Product;

public interface IProductService {
	void addProduct(Product product);
	Product queryProduct(Long productId);
}
