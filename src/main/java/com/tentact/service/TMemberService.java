package com.tentact.service;

import com.tentact.pojo.TMember;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TMemberService {

    //查询员工
    List<TMember> selectMember();

    //添加员工
    int addMember(TMember tMember);

    //删除员工
    int dropMember(String id);

    //更新员工
    TMember selectMemberById(String id);
    int updateMember(TMember tMember);
}
