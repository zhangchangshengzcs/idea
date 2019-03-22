package com.hgc.enums;

import lombok.Getter;

/**
 * @author: zcs
 * @create: 2019/3/19 17:58
 **/
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功")
    ;
    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
