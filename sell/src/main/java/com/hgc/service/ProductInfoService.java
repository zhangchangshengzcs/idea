package com.hgc.service;

import com.hgc.dataobject.ProductInfo;
import com.hgc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: zcs
 * @create: 2019/3/18 17:31
 **/
public interface ProductInfoService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表（分页）
     * @param
     * @return
     */
    List<ProductInfo> findUpAll();
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);
    //加库存
    void increaseStock(List<CartDTO> cartDTOList);
    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
