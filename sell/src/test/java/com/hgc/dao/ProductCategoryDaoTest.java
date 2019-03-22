package com.hgc.dao;

import com.hgc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author: zcs
 * @create: 2019/3/16 17:13
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;
    @Test
    public void findOneTest(){
        Optional<ProductCategory> productCategory=productCategoryDao.findById(1);
        System.out.println(productCategory.toString());
    }
    @Test
    public void saveTest(){
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("女生最爱11");
        productCategory.setCategoryType(3);
        productCategoryDao.save(productCategory);
    }
    @Test
    @Transactional //此注解与service里的事务不一样，在这里直接事务回滚
    public void updateTest(){
//        ProductCategory productCategory=new ProductCategory();
//        productCategory.setCategoryId(2);
//        productCategory.setCategoryName("男生最爱2");
//        productCategory.setCategoryType(3);
//        productCategoryDao.save(productCategory);
        ProductCategory productCategory=new ProductCategory("男生最爱11444",3);
        ProductCategory result=productCategoryDao.save(productCategory);
        Assert.assertNotEquals(null,result);
//        Assert.assertNotNull(result);
    }
    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list= Arrays.asList(1,2,3);
        //在进行list查询的时候，实体类必须要有默认构造方法
        List<ProductCategory> result= productCategoryDao.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }

}