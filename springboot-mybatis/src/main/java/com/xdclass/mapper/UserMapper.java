package com.xdclass.mapper;

import com.xdclass.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * m描述： 访问数据库的接口
 * @author: zcs
 * @create: 2019/1/23 14:38
 **/
@Mapper
public interface UserMapper {
    //推荐使用#{}取值，不要用${}，因为存在注入的风险
    //技巧：保存对象，获取数据库自增id
    @Insert("INSERT INTO `user`( `name`, `phone`, `create_time`, `age`) VALUES (#{name},#{phone}, #{createTime}, #{age})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")//keyProperty： java对象的属性；keyColumn: 表示数据库字段
    int insert(User user);

    /**
     * 功能描述：查找全部
     * @return
     */
    @Select("SELECT * FROM user")
    @Results({
            @Result(column = "create_time",property = "createTime")  //javaType = java.util.Date.class
    })
    List<User> getAll();

    /**
     * 功能描述：根据id查找
     * @param id
     * @return
     */
    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
            @Result(column = "create_time",property = "createTime")
    })
    User findById(Long id);

    /**
     * 功能描述：修改对象
     * @param user
     */
    @Update("UPDATE user SET name=#{name} WHERE id =#{id}")
    void update(User user);

    /**
     * 功能描述：根据id删除
     * @param userId
     */
    @Delete("DELETE FROM user WHERE id =#{userId}")
    void delete(Long userId);
}
