package com.tentact.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMember {

    private String id;
    private String name;
    private double salary;
    private String job;
    private Date work;
}
