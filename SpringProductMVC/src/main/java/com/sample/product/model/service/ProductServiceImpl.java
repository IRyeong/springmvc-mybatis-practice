package com.sample.product.model.service;

import org.springframework.stereotype.Service;

import com.sample.product.dto.ProductDTO;
import com.sample.product.model.repo.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {

	ProductDAO dao;
	
	public ProductServiceImpl(ProductDAO dao) {
		this.dao = dao;
	}

	@Override 
	public int addProduct(ProductDTO product) throws Exception{
		return dao.insert(product);
	}
	
	
}
