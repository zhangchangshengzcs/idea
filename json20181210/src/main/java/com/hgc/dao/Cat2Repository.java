package com.hgc.dao;

import com.hgc.bean.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface Cat2Repository extends Repository<Cat,Integer>{
    /**
     * 1.查询方法以find | get | read开头
     * 2.涉及查询条件时，条件的属性用条件关键字连接，要注意的是属性以首字母大写
     * @param catName
     * @return
     */
    //根据catName查询
    public Cat findByCatName(String catName);
    /**
     * 如何编写JPQL语句
     * Hibernate --HQL语句
     * JPQL语句和HQL语句是类似的
     */
    @Query("from Cat where catName=:cn")
    public Cat findMyCatName(@Param("cn") String catName);
}
