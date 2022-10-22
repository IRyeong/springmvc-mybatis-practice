package com.sample.product.model.repo;

import java.sql.SQLException;
import java.util.List;

import com.sample.product.dto.ProductDTO;

public interface ProductDAO {

	int insert(ProductDTO product) throws SQLException;

	List<ProductDTO> selectAll() throws SQLException;

	ProductDTO selectById(int id);

	void update(ProductDTO product);

}
