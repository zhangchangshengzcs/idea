package com.hgc.aopproxy;

/**
 * @author: zcs
 * @create: 2019/3/6 11:00
 **/
public interface AOP {
    public void before();
    public void after();
    public void exception();
    public void finall();
}
