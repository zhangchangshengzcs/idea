package com.hgc.service.impl;

import com.hgc.dataobject.ProductInfo;
import com.hgc.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: zcs
 * @create: 2019/3/19 10:18
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {
    @Autowired
    private ProductInfoServiceImpl service;
    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo=this.service.findOne("1234560");
        Assert.assertEquals("1234560",productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> productList=this.service.findUpAll();
        Assert.assertNotEquals(0,productList.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest pageRequest=PageRequest.of(0,2);
        Page<ProductInfo> productInfoPage=service.findAll(pageRequest);
//        System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("12388998");
        productInfo.setProductName("鸡蛋羹");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃");
        productInfo.setProductIcon("http://xxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);
        ProductInfo rs=this.service.save(productInfo);
        Assert.assertNotNull(rs);
    }

}