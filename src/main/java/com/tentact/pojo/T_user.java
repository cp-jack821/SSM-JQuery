package com.tentact.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class T_user {

    private String id;
    private String username;
    private String password;
    private String name;
    private String sex;
}
