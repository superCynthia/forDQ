/**
 * 
 */
package com.dq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dq.dataobject.ProductInfo;

/**
 * @author whr
 *
 * 2017年12月5日
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

}
