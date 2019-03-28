package com.hgc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hgc.dataobject.OrderDetail;
import com.hgc.enums.OrderStatusEnum;
import com.hgc.enums.PayStatusEnum;
import com.hgc.utils.serializer.Date2LongSerializer;
import lombok.Data;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 数据传输对象，Data Transfo Object 返回给controller层的对象
 * @author: zcs
 * @create: 2019/3/20 15:46
 **/
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)//此注解的作用：如果有属性是空，则不返回
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
//    @JsonSerialize(using = Date2LongSerializer.class)：此注解表示，引用指定类处理时间问题
    private Date createTime;
    /**修改时间*/
//    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;
    List<OrderDetail> orderDetailList;
}
