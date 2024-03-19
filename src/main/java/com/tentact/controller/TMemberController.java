package com.tentact.controller;


import com.tentact.pojo.TMember;
import com.tentact.service.TMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/mc")
public class TMemberController {

    @Autowired
    TMemberService tMemberService;

    @RequestMapping(value = "/sm",method = RequestMethod.POST)
    @ResponseBody
    public List<TMember> selectMember(){

        return tMemberService.selectMember();
    }

    @RequestMapping(value ="/im",method = RequestMethod.POST)
    @ResponseBody
    public int increaseMember(TMember tMember){

        return tMemberService.addMember(tMember);
    }

    @RequestMapping(value = "/rm",method = RequestMethod.GET)
    @ResponseBody
    public int deleteMember(String id){

        return tMemberService.dropMember(id);
    }

    @RequestMapping(value = "/um",method = RequestMethod.POST)
    @ResponseBody
    public int updateMember(TMember tMember){

        return tMemberService.updateMember(tMember);
    }

    @RequestMapping(value="/mb",method = RequestMethod.POST)
    @ResponseBody
    public TMember selectMemberById(String id){

        return tMemberService.selectMemberById(id);
    }

}
