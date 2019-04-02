package com.xdclass.service;

import com.xdclass.domain.User;

/**
 * @author: zcs
 * @create: 2019/1/23 14:59
 **/
public interface UserService {
    public int add(User user);

    /**
     * desc:测试事务
     * @return
     */
    public int addCount();
}
