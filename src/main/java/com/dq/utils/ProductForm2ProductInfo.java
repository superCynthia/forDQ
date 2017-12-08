package com.dq.utils;

import com.dq.dataobject.ProductInfo;
import com.dq.form.ProductForm;

/**
 * @author whr
 *
 *         2017年12月8日 下午5:53:40
 */
public class ProductForm2ProductInfo {

	public static ProductInfo convert(ProductForm productForm) {
		ProductInfo productInfo = new ProductInfo(productForm.getId(), productForm.getName(), productForm.getPrice(),
				productForm.getStock(), productForm.getDescription(), productForm.getType());
		return productInfo;
	}

}
