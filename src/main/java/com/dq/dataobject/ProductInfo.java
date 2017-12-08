package com.dq.dataobject;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * 农产品
 * 
 * @author whr 2017-12-05
 *
 */
@Data
@Entity
public class ProductInfo {

	@Id
	private String productId;

	/** 名字 */
	private String productName;

	/** 单价 */
	private BigDecimal productPrice;

	/** 数量 */
	private Integer productStock;

	/** 描述 */
	private String productDescription;

	/** 品种 */
	private String productType;

	private Date createTime;

	private Date updateTime;

	public ProductInfo() {
	}

	public ProductInfo(String productId, String productName, BigDecimal productPrice, Integer productStock,
			String productDescription, String productType) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
		this.productDescription = productDescription;
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "名称=" + productName + "\n价格=" + productPrice + "\n库存=" + productStock + "\n描述=" + productDescription
				+ "\n品种=" + productType;
	}

}
