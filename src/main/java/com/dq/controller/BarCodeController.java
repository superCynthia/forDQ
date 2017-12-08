package com.dq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dq.barcode.QRCodeUtil;
import com.dq.dataobject.ProductInfo;
import com.dq.service.ProductService;

/**
 * @author whr
 *
 *         2017年12月8日 上午11:07:14
 */
@RestController
@RequestMapping("/barCode")
public class BarCodeController {

	@Autowired
	private ProductService productService;

	@GetMapping("/create")
	public void create(@RequestParam("content") String content) {

		try {
			QRCodeUtil.encode(content, "D:/javademo/AgriculturalProducts/src/main/resources/static/img/helloworld.jpg");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("[二维码生成错误] content= " + content);
		}
	}

	@GetMapping("/createAll")
	public String createAll() {

		try {
			PageRequest request = new PageRequest(0, 5);
			Page<ProductInfo> productInfoPage = productService.findAll(request);

			List<ProductInfo> productInfoList = productInfoPage.getContent();
			for (ProductInfo product : productInfoList) {
				QRCodeUtil.encode(product.toString(), "D:/javademo/AgriculturalProducts/src/main/resources/static/img");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("二维码生成错误!");
			return "error!";
		}
		
		return "ok!";
	}

}
