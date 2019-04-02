package com.hgc.model;

/**
 * @author: zcs
 * @create: 2019/1/4 11:20
 **/
public class OrderDetail {
    private String orderId;
    private Item item=new Item();

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public OrderDetail() {
    }

    public OrderDetail(String orderId, Item item) {
        this.orderId = orderId;
        this.item = item;
    }
}
