package com.hgc.converter;

import com.hgc.dataobject.OrderMaster;
import com.hgc.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: zcs
 * @create: 2019/3/25 16:16
 **/
public class OrderMaster2OrderDTO {
    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO=new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }
    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
//        List<OrderDTO> orderDTOList=new ArrayList<>();
//        for (OrderMaster orderMaster :
//                orderMasterList) {
//            orderDTOList.add(convert(orderMaster));
//        }
        return orderMasterList.stream().map(e ->
        convert(e)
        ).collect(Collectors.toList());
    }
}
