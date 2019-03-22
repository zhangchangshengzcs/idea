package com.hgc.dao;

import com.hgc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: zcs
 * @create: 2019/3/18 16:14
 * 备注：JpaRepository<ProductCategory,Integer> 泛型，第一个是实体类，第二个是实体类的主键类型
 **/
public interface ProductInfoDao extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
