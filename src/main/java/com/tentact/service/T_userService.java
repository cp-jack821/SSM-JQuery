package com.tentact.service;

import com.tentact.pojo.T_user;
import org.springframework.stereotype.Service;



public interface T_userService {

    //登录
    T_user findByuNamepWord(String username, String password);

    //注册
    T_user selectByuName(String username);
    int regist(T_user t_user);

}
