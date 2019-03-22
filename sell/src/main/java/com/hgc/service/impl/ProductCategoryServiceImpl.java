package com.hgc.service.impl;

import com.hgc.dao.ProductCategoryDao;
import com.hgc.dataobject.ProductCategory;
import com.hgc.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zcs
 * @create: 2019/3/18 15:10
 **/
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{
    @Autowired
    private ProductCategoryDao productCategoryDao;
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return this.productCategoryDao.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> findAll() {
        return this.productCategoryDao.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList) {
        return this.productCategoryDao.findByCategoryTypeIn(categoryList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return this.productCategoryDao.save(productCategory);
    }
}
