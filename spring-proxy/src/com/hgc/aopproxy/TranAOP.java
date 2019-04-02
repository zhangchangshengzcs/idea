package com.hgc.aopproxy;

/**
 * @author: zcs
 * @create: 2019/3/6 11:52
 **/
public class TranAOP implements AOP {
    @Override
    public void before() {
        System.out.println("事务开始");
    }

    @Override
    public void after() {
        System.out.println("事务提交");
    }

    @Override
    public void exception() {
        System.out.println("事务回滚");
    }

    @Override
    public void finall() {

    }
}
