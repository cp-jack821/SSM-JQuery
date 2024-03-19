package com.tentact.controller;

import com.tentact.pojo.T_user;
import com.tentact.service.T_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
//@RequestMapping(value = "/tc")
@RequestMapping("/tc")
public class T_userController {

    @Autowired
    T_userService t_userService;

    @RequestMapping(value="/gn",method = RequestMethod.GET)
    @ResponseBody
    public T_user getByuNamepWord(String username,String password){
        System.out.println(t_userService.findByuNamepWord(username, password));
        return t_userService.findByuNamepWord(username, password);
    }

    @RequestMapping(value = "/fn",method = RequestMethod.POST)
    @ResponseBody
    public T_user findByuName(String username){
        System.out.println("username = " + username);

        return t_userService.selectByuName(username);
    }

    @RequestMapping(value = "/ns",method = RequestMethod.POST)
    @ResponseBody
    public int insert(T_user t_user){
        return t_userService.regist(t_user);
    }






}
