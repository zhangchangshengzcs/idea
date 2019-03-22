package com.hgc.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hgc.dataobject.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * @author: zcs
 * @create: 2019/3/19 11:33
 **/
@Data
public class ProductVO {
    @JsonProperty("name")//这个注解表示返回前端的属性叫name
    private String categoryName;
    @JsonProperty("type")//这个注解表示返回前端的属性叫type
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
