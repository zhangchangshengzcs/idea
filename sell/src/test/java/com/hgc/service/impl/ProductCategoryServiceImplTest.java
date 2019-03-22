package com.hgc.service.impl;

import com.hgc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author: zcs
 * @create: 2019/3/18 15:24
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {
    @Autowired
    private ProductCategoryServiceImpl productCategoryService;
    @Test
    public void findOne() throws Exception {
        ProductCategory productCategory=productCategoryService.findOne(1);
        Assert.assertNotEquals(null,productCategory);
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> productCategoryList=productCategoryService.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> productCategoryList=productCategoryService.findByCategoryTypeIn(Arrays.asList(1,2,3));
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory=new ProductCategory("男生专享",4);
        ProductCategory result=productCategoryService.save(productCategory);
        Assert.assertNotNull(result);
    }

}