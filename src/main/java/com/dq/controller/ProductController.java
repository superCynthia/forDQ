package com.dq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dq.dataobject.ProductInfo;
import com.dq.service.ProductService;

/**
 * @author whr
 *
 * 2017年12月5日
 */
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/list")
	public Page<ProductInfo> list(){
		
		PageRequest request = new PageRequest(0, 2);
		Page<ProductInfo> productInfoList = productService.findAll(request);
		
		return productInfoList;
	}
	
}
