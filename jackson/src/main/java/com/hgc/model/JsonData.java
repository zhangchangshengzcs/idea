package com.hgc.model;

import java.io.Serializable;

public class JsonData implements Serializable{
    //状态码,0表示成功，-1表示失败
    private int code;
    //结果
    private Object data;
    //提示消息
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JsonData(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public JsonData() {
    }

    public JsonData(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
