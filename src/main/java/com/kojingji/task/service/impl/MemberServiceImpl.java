package com.kojingji.task.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kojingji.task.dao.MemberMapper;
import com.kojingji.task.models.Member;
import com.kojingji.task.service.intf.MemberService;


@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
    private MemberMapper memberMapper;


    
    public Member getMemberById(String qqId) {
        return memberMapper.selectByPrimaryKey(1L);
        
    }

}