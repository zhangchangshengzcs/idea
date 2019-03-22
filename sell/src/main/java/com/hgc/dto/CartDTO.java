package com.hgc.dto;

import lombok.Data;

/**
 * @author: zcs
 * @create: 2019/3/21 14:46
 **/
@Data
public class CartDTO {
    /**商品id*/
    private String productId;
    /**数量*/
    private Integer prodcutQuantity;

    public CartDTO(String productId, Integer prodcutQuantity) {
        this.productId = productId;
        this.prodcutQuantity = prodcutQuantity;
    }

    public CartDTO() {
        super();
    }
}
