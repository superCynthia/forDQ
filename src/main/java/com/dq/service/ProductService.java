/**
 * 
 */
package com.dq.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dq.dataobject.ProductInfo;


/**
 * @author whr
 *
 * 2017年12月5日
 */
public interface ProductService {

	ProductInfo findOne(String productId);
	
	Page<ProductInfo> findAll(Pageable pageable);
	
	ProductInfo save(ProductInfo productInfo);
	
	//加数量
	void increaseStock(List<ProductInfo> productList);
	
	//减数量
	void decreaseStock(List<ProductInfo> productList);
}
