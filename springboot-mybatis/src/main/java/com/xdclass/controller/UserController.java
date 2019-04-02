package com.xdclass.controller;

import com.xdclass.domain.User;
import com.xdclass.mapper.UserMapper;
import com.xdclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: zcs
 * @create: 2019/1/23 15:04
 **/
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    /**
     * desc:添加用户
     * @return
     */
    @GetMapping("/add")
    public Object add(){
        User user=new User();
        user.setAge(11);
        user.setCreateTime(new Date());
        user.setName("xdClass");
        user.setPhone("18832005981");
        int id=this.userService.add(user);
        return user;
    }

    /**
     * desc:查找所有用户
     * @return
     */
    @GetMapping("/getAll")
    public Object findAll(){
        return this.userMapper.getAll();
    }

    /**
     * desc:根据id查找用户
     * @param id
     * @return
     */
    @GetMapping("/find_by_id")
    public Object findById(Long id){
        return this.userMapper.findById(id);
    }

    /**
     * desc:根据id删除用户
     * @param id
     * @return
     */
    @GetMapping("/del_by_id")
    public Object delById(Long id){
        this.userMapper.delete(id);
        return "success";
    }

    /**
     * desc:修改用户
     * @param name
     * @param id
     * @return
     */
    @GetMapping("/update")
    public Object update(String name,int id){
        User user=new User();
        user.setName(name);
        user.setId(id);
        this.userMapper.update(user);
        return "success";
    }

    /**
     * desc:测试事务
     * @return
     */
    @GetMapping("/addAcount")
    public Object addAcount(){
        int id=userService.addCount();
        return "success";
    }
}
