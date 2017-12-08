package com.dq.form;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

/**
 * @author whr
 *
 * 2017年12月8日 下午5:38:53
 */
@Data
public class ProductForm {

	@NotEmpty(message = "编号必填")
	private String id;
	
	@NotEmpty(message = "名称必填")
	private String name;
	
//	@NotEmpty(message = "价格必填")
	private BigDecimal price;
	
//	@NotEmpty(message = "数量必填")
	private Integer stock;
	
	private String description;
	
	private String type;
}
