package com.dq.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dq.barcode.QRCodeUtil;
import com.dq.dataobject.ProductInfo;
import com.dq.form.ProductForm;
import com.dq.service.ProductService;
import com.dq.utils.ProductForm2ProductInfo;

/**
 * @author whr
 *
 * 2017年12月8日 下午5:21:56
 */
@Controller
@RequestMapping("/pages")
public class MainController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/main")
	public String main(){
//		model.addAttribute(arg0)
		return "pages/main";
	}
	
	@PostMapping("/solve")
	public String solve(@Valid ProductForm productForm, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "pages/error";
		}
		
		ProductInfo productInfo = productService.save(ProductForm2ProductInfo.convert(productForm));
		if(productInfo == null){
			return "pages/error";
		}
		
		try {
			QRCodeUtil.encode(productInfo.toString(), "D:/javademo/AgriculturalProducts/src/main/resources/static/img");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "pages/error";
		}
		
		return "pages/main";
	}
}
