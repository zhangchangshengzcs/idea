package com.hgc.service;

import com.hgc.bean.Cat;
import com.hgc.dao.Cat2Repository;
import com.hgc.dao.CatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class CatService {
    @Resource
    private CatRepository catRepository;
    @Resource
    private Cat2Repository cat2Repository;
    //保存数据
    @Transactional
    public void save(Cat cat){
        this.catRepository.save(cat);
    }
    //删除数据
    @Transactional
    public void delete(int id){
        this.catRepository.deleteById(id);
    }
    //查询所有数据
    public Iterable<Cat> getAll(){
        return this.catRepository.findAll();
    }
    //根据catName查询
    public Cat findByCatName(String catName){
        return cat2Repository.findByCatName(catName);
    }
    public Cat findByCatName2(String catName){
        return cat2Repository.findMyCatName(catName);
    }
}
