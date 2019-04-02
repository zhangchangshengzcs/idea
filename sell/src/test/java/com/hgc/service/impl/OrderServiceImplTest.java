package com.hgc.service.impl;

import com.hgc.dataobject.OrderDetail;
import com.hgc.dto.OrderDTO;
import com.hgc.enums.OrderStatusEnum;
import com.hgc.enums.PayStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: zcs
 * @create: 2019/3/22 15:38
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {
    @Autowired
    private OrderServiceImpl orderService;
    private final String BUYER_OPENID="15531089758";
    private final String ORDER_ID="1553247752191810162";
    @Test
    public void create() throws Exception {
        OrderDTO orderDTO=new OrderDTO();
        orderDTO.setBuyerName("宝石1");
        orderDTO.setBuyerAddress("慕课网");
        orderDTO.setBuyerPhone("123456789");
        orderDTO.setBuyerOpenid(BUYER_OPENID);
        //购物车
        List<OrderDetail> orderDetailList=new ArrayList<>();
        OrderDetail o1=new OrderDetail();
        o1.setProductId("753951");
        o1.setProductQuantity(2);
        OrderDetail o2=new OrderDetail();
        o2.setProductId("1359845");
        o2.setProductQuantity(2);
        orderDetailList.add(o1);
        orderDetailList.add(o2);
        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO result=orderService.create(orderDTO);
        log.info("[创建订单]result={}",result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() throws Exception {
        OrderDTO orderDTO=orderService.findOne(ORDER_ID);
        log.info("查询首个订单 result={}",orderDTO);
        Assert.assertEquals(ORDER_ID,orderDTO.getOrderId());
    }

    @Test
    public void findList() throws Exception {
//        PageRequest request=new PageRequest(0,2);
        PageRequest request=PageRequest.of(0,2);
        Page<OrderDTO> orderDTOPage=orderService.findList(BUYER_OPENID,request);
        Assert.assertNotEquals(0,orderDTOPage.getTotalElements());
    }

    @Test
    public void cancel() throws Exception {
        OrderDTO orderDTO=orderService.findOne(ORDER_ID);
        OrderDTO result=orderService.cancel(orderDTO);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(),result.getOrderStatus());
    }

    @Test
    public void finish() throws Exception {
        OrderDTO orderDTO=orderService.findOne(ORDER_ID);
        OrderDTO result=orderService.finish(orderDTO);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(),result.getOrderStatus());
    }

    @Test
    public void paid() throws Exception {
        OrderDTO orderDTO=orderService.findOne(ORDER_ID);
        OrderDTO result=orderService.paid(orderDTO);
        Assert.assertEquals(PayStatusEnum.SUCCESS.getCode(),result.getPayStatus());
    }

}