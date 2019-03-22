package com.hgc.dataobject;

import com.hgc.enums.OrderStatusEnum;
import com.hgc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: zcs
 * @create: 2019/3/19 17:37
 **/
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    /**订单id*/
    @Id
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
    private Integer orderStatus= OrderStatusEnum.NEW.getCode();
    /**支付状态,默认为0未支付*/
    private Integer payStatus= PayStatusEnum.WAIT.getCode();
    /**创建时间*/
    private Date createTime;
    /**修改时间*/
    private Date updateTime;
}
