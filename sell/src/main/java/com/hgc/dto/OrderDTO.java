package com.hgc.dto;

import com.hgc.dataobject.OrderDetail;
import com.hgc.enums.OrderStatusEnum;
import com.hgc.enums.PayStatusEnum;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 数据传输对象，Data Transfo Object 返回给controller层的对象
 * @author: zcs
 * @create: 2019/3/20 15:46
 **/
@Data
public class OrderDTO {
    /**订单id*/
    private String orderId;
    /**买家名字*/
    private String buyerName;
    /**买家手机号*/
    private String buyerPhone;
    /**买家地址*/
    private String buyerAddress;
    /**买家微信Openid*/
    private String buyerOpenid;
    /**订单总金额*/
    private BigDecimal orderAmount;
    /**订单状态，默认为新下单*/
    private Integer orderStatus;
    /**支付状态,默认为0未支付*/
    private Integer payStatus;
    /**创建时间*/
    private Date createTime;
    /**修改时间*/
    private Date updateTime;
    List<OrderDetail> orderDetailList;
}
