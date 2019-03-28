package com.hgc.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hgc.dataobject.OrderDetail;
import com.hgc.dto.OrderDTO;
import com.hgc.enums.ResultEnum;
import com.hgc.exception.SellException;
import com.hgc.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zcs
 * @create: 2019/3/27 10:14
 **/
@Slf4j
public class OrderForm2OrderDTO {
    public static OrderDTO convert(OrderForm orderForm){
        Gson gson=new Gson();
        OrderDTO orderDTO=new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        List<OrderDetail> orderDetailList=new ArrayList<>();
        try {
            orderDetailList=gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>(){}.getType());
        }catch (Exception e){
            log.error("[对象转换]错误,string={}",orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_EROOR);
        }
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
