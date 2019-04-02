package com.hgc.aopproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: zcs
 * @create: 2019/3/6 11:23
 **/
public class MyHandler implements InvocationHandler {
    private Object obj;//被代理对象
    private AOP aop;//切面代码
    public MyHandler(Object obj,AOP aop){
        this.obj=obj;
        this.aop=aop;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            aop.before();
            Object o = method.invoke(obj, args);
            aop.after();
            return null;
        }catch (Exception e){
            e.printStackTrace();
            aop.exception();
            throw new RuntimeException(e);
        }finally {
            aop.finall();
        }
    }
}
