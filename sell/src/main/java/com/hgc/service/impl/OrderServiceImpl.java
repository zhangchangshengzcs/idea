package com.hgc.service.impl;

import com.hgc.dao.OrderDetailDao;
import com.hgc.dao.OrderMasterDao;
import com.hgc.dataobject.OrderDetail;
import com.hgc.dataobject.OrderMaster;
import com.hgc.dataobject.ProductInfo;
import com.hgc.dto.OrderDTO;
import com.hgc.enums.ResultEnum;
import com.hgc.exception.SellException;
import com.hgc.service.OrderService;
import com.hgc.service.ProductInfoService;
import com.hgc.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author: zcs
 * @create: 2019/3/20 16:19
 **/
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderMasterDao orderMasterDao;
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private OrderDetailDao orderDetailDao;
    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        String orderId= KeyUtil.genUniqueKey();
        BigDecimal orderAmount=new BigDecimal(0);
        //1.查询商品（数量，价格）
        for (OrderDetail orderDetail :
                orderDTO.getOrderDetailList()) {
            ProductInfo productInfo=productInfoService.findOne(orderDetail.getProductId());
            if(productInfo==null){
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            //2.计算订单总价
            orderAmount=orderDetail.getProductPrice()
                    .multiply(new BigDecimal(orderDetail.getProductQuantity()))
                    .add(orderAmount);
            //订单详情入库
            orderDetail.setDetailId(KeyUtil.genUniqueKey());
            orderDetail.setOrderId(orderId);
            BeanUtils.copyProperties(productInfo,orderDetail);//把productInfo的属性拷贝到orderDetail中
            orderDetailDao.save(orderDetail);
        }
        //3.写入订单数据库（orderMaster和orderDetail）
        OrderMaster orderMaster=new OrderMaster();
        orderMaster.setOrderId(orderId);
        orderMaster.setOrderAmount(orderAmount);
        BeanUtils.copyProperties(orderDTO,orderMaster);
        orderMasterDao.save(orderMaster);
        //4.扣库存 :先判断数量是否够
        return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
