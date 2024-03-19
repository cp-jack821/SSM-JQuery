package com.tentact;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.tentact.dao")
public class SsmJQueryApplication {

    public static void main(String[] args) {

        SpringApplication.run(SsmJQueryApplication.class, args);

    }

}
