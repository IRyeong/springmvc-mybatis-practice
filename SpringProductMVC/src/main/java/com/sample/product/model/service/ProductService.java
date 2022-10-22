package com.sample.product.model.service;

import java.util.List;

import com.sample.product.dto.ProductDTO;

public interface ProductService {

	int addProduct(ProductDTO product) throws Exception;
	List<ProductDTO> showList() throws Exception;
	ProductDTO getProductById(int id);
	void change(ProductDTO product);

}
