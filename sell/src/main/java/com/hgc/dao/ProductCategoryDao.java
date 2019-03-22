package com.hgc.dao;

import com.hgc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: zcs
 * @create: 2019/3/16 17:11
 * 备注：JpaRepository<ProductCategory,Integer> 泛型，第一个是实体类，第二个是实体类的主键类型
 **/
public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList);
}
