package com.dq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dq.dataobject.ProductInfo;
import com.dq.repository.ProductInfoRepository;
import com.dq.service.ProductService;

/**
 * @author whr
 *
 * 2017年12月5日
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductInfoRepository repository;
	
	@Override
	public ProductInfo findOne(String productId) {
		return repository.findOne(productId);
	}

	@Override
	public Page<ProductInfo> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public ProductInfo save(ProductInfo productInfo) {
		return repository.save(productInfo);
	}

	@Override
	@Transactional
	public void increaseStock(List<ProductInfo> productList) {
		
	}

	@Override
	@Transactional
	public void decreaseStock(List<ProductInfo> productList) {
		// TODO Auto-generated method stub
		
	}

}
