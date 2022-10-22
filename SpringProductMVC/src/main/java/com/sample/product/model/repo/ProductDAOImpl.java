package com.sample.product.model.repo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	SqlSession sqlSession;
	
	public ProductDAOImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
