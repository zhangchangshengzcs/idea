package com.hgc.activeproxy;

import com.hgc.activeproxy.GoodsService;

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
}
