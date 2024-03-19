package com.tentact.dao;

import com.tentact.pojo.TMember;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TMemberMapper {

    //查询员工
    List<TMember> selectMember();

    //添加员工
    int insertMember(TMember tMember);

    //删除员工
    int deleteMember(String id);

    //更新员工
    //查询员工通过id
    TMember selectMemberById(String id);
    int updateMember(TMember tMember);
}
