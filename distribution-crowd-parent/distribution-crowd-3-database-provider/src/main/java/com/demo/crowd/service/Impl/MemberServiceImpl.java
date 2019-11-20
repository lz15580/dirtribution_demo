package com.demo.crowd.service.Impl;


import com.demo.crowd.mapper.MemberPOMapper;
import com.demo.crowd.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class MemberServiceImpl extends MemberService {

    @Autowired
    private MemberPOMapper memberPOMapper;
}
