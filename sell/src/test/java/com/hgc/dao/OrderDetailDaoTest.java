package com.hgc.dao;

import com.hgc.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: zcs
 * @create: 2019/3/20 12:00
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {
    @Autowired
    private OrderDetailDao orderDetailDao;
    @Test
    public void saveTest(){
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setDetailId("123456783");
        orderDetail.setOrderId("1234567");
        orderDetail.setProductId("12388998");
        orderDetail.setProductName("鸡蛋羹");
        orderDetail.setProductPrice(new BigDecimal(3.2));
        orderDetail.setProductQuantity(3);
        orderDetail.setProductIcon("http://bbbb.jpg");
        OrderDetail result=orderDetailDao.save(orderDetail);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList=orderDetailDao.findByOrderId("123456");
        Assert.assertNotEquals(0,orderDetailList.size());
    }

}