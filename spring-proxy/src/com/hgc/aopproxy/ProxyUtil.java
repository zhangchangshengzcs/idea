package com.hgc.aopproxy;

import java.lang.reflect.Proxy;

/**
 * @author: zcs
 * @create: 2019/3/6 11:41
 **/
public class ProxyUtil {
    /**
     * 创建动态代理对象的方法
     * @param obj 被代理对象
     * @param aop 切面代码
     * @return 动态代理的对象
     */
    public static Object getProxy(Object obj,AOP aop){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new MyHandler(obj,aop));
    }
}
