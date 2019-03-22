package com.hgc.service.impl;

import com.hgc.dao.ProductInfoDao;
import com.hgc.dataobject.ProductInfo;
import com.hgc.dto.CartDTO;
import com.hgc.enums.ProductStatusEnum;
import com.hgc.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zcs
 * @create: 2019/3/18 17:46
 **/
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoDao productInfoDao;
    @Override
    public ProductInfo findOne(String productId) {
        return this.productInfoDao.findById(productId).get();
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return this.productInfoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoDao.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return this.productInfoDao.save(productInfo);
    }

    @Override
    public void increaseStock(List<CartDTO> cartDTOList) {

    }

    @Override
    public void decreaseStock(List<CartDTO> cartDTOList) {

    }
}
