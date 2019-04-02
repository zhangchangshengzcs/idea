package com.xdclass.service.impl;

import com.xdclass.domain.User;
import com.xdclass.mapper.UserMapper;
import com.xdclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author: zcs
 * @create: 2019/1/23 15:00
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int add(User user) {
        userMapper.insert(user);
        int id=user.getId();
        return id;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)//支持事务
    public int addCount() {
        User user=new User();
        user.setAge(22);
        user.setCreateTime(new Date());
        user.setName("测试加入事务");
        user.setPhone("15179750179");
        userMapper.insert(user);
        int i=19/0;
        return 0;
    }
}
