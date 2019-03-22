package com.hgc.exception;

import com.hgc.enums.ResultEnum;

/**
 * @author: zcs
 * @create: 2019/3/21 10:41
 **/
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
