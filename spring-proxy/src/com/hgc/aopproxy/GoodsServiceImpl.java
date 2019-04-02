package com.hgc.aopproxy;

/**
 * @description: 被代理类
 * @author: zcs
 * @create: 2019/3/1 15:05
 **/
public class GoodsServiceImpl implements GoodsService {
    @Override
    public void save() {
        System.out.println("sava业务方法");
    }

    @Override
    public Object update(String str) {
        System.out.println("这是Update方法"+str);
        int i=1/0;
        return "更新返回的值";
    }
}
