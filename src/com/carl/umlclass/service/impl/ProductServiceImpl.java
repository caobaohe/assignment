package com.carl.umlclass.service.impl;

import com.carl.umlclass.bean.Product;
import com.carl.umlclass.dao.ProductDao;
import com.carl.umlclass.service.IProductService;

public class ProductServiceImpl implements IProductService {
	private ProductDao productDao;

	public ProductServiceImpl() {
		productDao = new ProductDao();
	}

	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);
	}

	@Override
	public Product queryProduct(Long productId) {
		return productDao.queryProduct(productId);
	}

}
