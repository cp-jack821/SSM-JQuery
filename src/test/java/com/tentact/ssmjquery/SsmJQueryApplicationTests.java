package com.tentact.ssmjquery;

import com.tentact.controller.T_userController;
import com.tentact.pojo.T_user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SsmJQueryApplicationTests {

    @Autowired
    T_userController t_userController;
    @Test
    void contextLoads() {
        T_user user = new T_user();
        System.out.println(t_userController.insert(user));

    }

}
