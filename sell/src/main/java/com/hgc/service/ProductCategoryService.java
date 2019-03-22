package com.hgc.service;

import com.hgc.dataobject.ProductCategory;

import java.util.List;

/**
 * @author: zcs
 * @create: 2019/3/18 15:04
 **/
public interface ProductCategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList);
    ProductCategory save(ProductCategory productCategory);
}
