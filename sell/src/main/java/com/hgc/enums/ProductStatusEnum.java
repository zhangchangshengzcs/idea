package com.hgc.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author: zcs
 * @create: 2019/3/18 17:55
 **/
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message=message;
    }

    ProductStatusEnum() {
    }
}
