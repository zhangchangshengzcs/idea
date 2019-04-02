package com.hgc.service;

import com.hgc.dto.OrderDTO;

/**
 * 买家
 * @author: zcs
 * @create: 2019/3/27 17:51
 **/
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
