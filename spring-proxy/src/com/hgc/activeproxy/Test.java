package com.hgc.activeproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: zcs
 * @create: 2019/3/5 17:24
 **/
public class Test {
    public static void main(String[] args){
        GoodsServiceImpl goodsServiceImpl=new GoodsServiceImpl();
        System.out.println(goodsServiceImpl.getClass().getName());//被代理类的名称
        //基于JDK的动态代理只能针对接口
        GoodsService goodsService= (GoodsService) Proxy.newProxyInstance(goodsServiceImpl.getClass().getClassLoader(),
                goodsServiceImpl.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("事务开始");
                Object o=method.invoke(goodsServiceImpl,args);
                System.out.println("事务结束");
                return o;
            }
        });
        goodsService.save();
        System.out.println(goodsService.getClass().getName());//动态代理类的名称
    }
}
