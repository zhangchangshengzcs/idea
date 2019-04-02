package com.hgc.dao;

import com.hgc.bean.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat,Integer> {
}
