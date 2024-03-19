package com.tentact.dao;

import com.tentact.pojo.T_user;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface T_userMapper {

//    通过用户名和密码查询
//    返回类型是对象

    T_user selectByuNamepWord(@Param("name") String username,@Param("pwd") String password);

//    注册(先判断用户是否存在于表中，如果没有调用添加方法)
    T_user selectByuName(String name);
    int regist(T_user t_user);


}
