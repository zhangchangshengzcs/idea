package com.hgc.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author: zcs
 * @create: 2019/3/19 11:18
 **/
@Data
public class ResultVO<T> {
    /**错误码*/
    private Integer code;
    /**提示信息*/
    private String msg;
    /**返回具体内容*/
    private T data;
}
