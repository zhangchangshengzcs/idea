package com.hgc.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: zcs
 * @create: 2019/1/10 16:12
 **/
@Component
@ConfigurationProperties(prefix="itcast") //以itcast开头的配置被匹配到
public class OrderProperties {

    private ItemProperties item = new ItemProperties();

    public ItemProperties getItem() {
        return item;
    }

    public void setItem(ItemProperties item) {
        this.item = item;
    }

}
