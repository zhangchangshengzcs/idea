package com.hgc.aopproxy;

/**
 * @author: zcs
 * @create: 2019/3/6 11:54
 **/
public class Test {
    public static void main(String[] args) {
        //先创建被代理对象
        GoodsServiceImpl goodsServiceImpl = new GoodsServiceImpl();
        //后创建切面代码对象
        TranAOP tranAOP = new TranAOP();
        //通过工具类获取动态代理类的对象
        GoodsService proxyGoodsService = (GoodsService) ProxyUtil.getProxy(goodsServiceImpl, tranAOP);
        proxyGoodsService.save();
        proxyGoodsService.update("你好");
    }

}
