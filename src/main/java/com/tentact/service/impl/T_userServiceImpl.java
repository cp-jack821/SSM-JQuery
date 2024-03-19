package com.tentact.service.impl;

import com.tentact.dao.T_userMapper;
import com.tentact.pojo.T_user;
import com.tentact.service.T_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class T_userServiceImpl implements T_userService {


    @Autowired
    private T_userMapper t_userMapper;

    /**
     * 根据用户和密码查询
     * @param username
     * @param password
     * @return
     */

    @Override
    public T_user findByuNamepWord(String username, String password) {
        T_user t_user = t_userMapper.selectByuNamepWord(username, password);
        return t_user;
    }

    /**
     *根据用户名查询用户是否存在
     * @param username
     * @return
     */
    //查询
    @Override
    public T_user selectByuName(String username){
        T_user t_user = t_userMapper.selectByuName(username);
        return t_user;
    }

    /**
     *向数据库添加数据
     * @param t_user
     * @return
     */
    //添加
    @Override
    public int regist(T_user t_user) {

        t_user.setId(UUID.randomUUID().toString());
        int regist = t_userMapper.regist(t_user);
        return regist;
    }




}
