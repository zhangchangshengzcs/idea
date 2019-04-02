package com.itcast.controller;

import com.itcast.model.Item;
import com.itcast.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcs
 * @create: 2019/1/4 11:01
 **/
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;
    @GetMapping("/item/{id}")
    public Item queryItemById(@PathVariable("id") Long id){
        return this.itemService.queryItemById(id);
    }
}
