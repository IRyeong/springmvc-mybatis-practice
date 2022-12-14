package com.sample.product.model.repo;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.product.dto.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	SqlSession sqlSession;
	
	@Autowired
	public ProductDAOImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int insert(ProductDTO product) throws SQLException {
		return sqlSession.insert("product.insert", product);
	}

	@Override
	public List<ProductDTO> selectAll() throws SQLException {
		return sqlSession.selectList("product.selectAll");
	}

}
