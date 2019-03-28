package com.hgc.controller;

import com.hgc.dataobject.ProductCategory;
import com.hgc.dataobject.ProductInfo;
import com.hgc.service.ProductCategoryService;
import com.hgc.service.ProductInfoService;
import com.hgc.utils.ResultVOUtil;
import com.hgc.vo.ProductInfoVO;
import com.hgc.vo.ProductVO;
import com.hgc.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: zcs
 * @create: 2019/3/19 11:11
 **/
@RestController
@RequestMapping("/buyer/product")
public class BuyProductController {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductCategoryService productCategoryService;
    @GetMapping("/list")
    public ResultVO list(){
        //1.查询所有的上架商品
        List<ProductInfo> productInfoList=productInfoService.findUpAll();
        //2.查询类目（一次性查询）
        //传统方法
//        List<Integer> categoryTypeList=new ArrayList<>();
//        for (ProductInfo productInfo :
//                productInfoList) {
//            categoryTypeList.add(productInfo.getCategoryType());
//        }
        //精简方法（java8 lambda表达式）
        List<Integer> categoryTypeList=productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> productCategoryList=productCategoryService.findByCategoryTypeIn(categoryTypeList);
        //3.数据拼接
        List<ProductVO> productVOList=new ArrayList<>();
        for (ProductCategory productCategory :
                productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());
            List<ProductInfoVO> productInfoVOList=new ArrayList<>();
            for (ProductInfo productInfo :
                    productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO=new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);//使用BeanUtils工具类
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }
    @GetMapping("/liqi")
    public String test(){
        return "李琪是傻逼!";
    }
}
