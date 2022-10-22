package com.sample.product.model.repo;

import java.sql.SQLException;

import com.sample.product.dto.ProductDTO;

public interface ProductDAO {

	int insert(ProductDTO product) throws SQLException;

}
