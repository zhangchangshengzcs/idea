package com.hgc.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: zcs
 * @create: 2019/3/6 14:14
 **/
public class Test {
    public static void main(String[] args){
        GoodsTypeService service= (GoodsTypeService) Enhancer.create(GoodsTypeService.class,
                new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        System.out.println("日志记录");
                        Object object=methodProxy.invokeSuper(o,objects);
                        return object;
                    }
                }
        );
        service.sava();
    }
    
}
