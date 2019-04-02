package com.hgc.stativproxy;

/**
 * @description: 代理类
 * @author: zcs
 * @create: 2019/3/1 15:02
 **/
public class ProxyGoodsService implements GoodsService {
    private GoodsService goodsService;//被代理类对象

    public ProxyGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @Override
    public void save() {
        System.out.println("事务开始");
        goodsService.save();//被代理类对象的业务方法
        System.out.println("事务结束");
    }

    public GoodsService getGoodsService() {
        return goodsService;
    }

    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
}
