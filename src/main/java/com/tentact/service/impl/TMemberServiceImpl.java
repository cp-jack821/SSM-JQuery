package com.tentact.service.impl;

import com.tentact.dao.TMemberMapper;
import com.tentact.pojo.TMember;
import com.tentact.service.TMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class TMemberServiceImpl implements TMemberService {

    @Autowired
    private TMemberMapper tMemberMapper;


    /**
     * 员工一览
     * @return
     */
    @Override
    public List<TMember> selectMember() {

        return tMemberMapper.selectMember();
    }


    /**
     * 添加员工
     * @param tMember
     * @return
     */
    @Override
    public int addMember(TMember tMember){

        tMember.setId(UUID.randomUUID().toString());
        int addMember = tMemberMapper.insertMember(tMember);
        return addMember;
    }

    /**
     * 删除员工
     * @param id
     * @return
     */
    @Override
    public int dropMember(String id){

        return tMemberMapper.deleteMember(id);
    }



    /**
     * 更新员工
     * @param tMember
     * @return
     */
    @Override
    public int updateMember(TMember tMember) {

        return tMemberMapper.updateMember(tMember);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public TMember selectMemberById(String id) {

        return tMemberMapper.selectMemberById(id);
    }







}
