package com.hgc;

import com.hgc.stativproxy.GoodsServiceImpl;
import com.hgc.stativproxy.ProxyGoodsService;

/**
 * 测试
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        GoodsServiceImpl goodsService=new GoodsServiceImpl();//被代理类对象
        ProxyGoodsService service=new ProxyGoodsService(goodsService);//代理类对象
        service.save();
    }
}
