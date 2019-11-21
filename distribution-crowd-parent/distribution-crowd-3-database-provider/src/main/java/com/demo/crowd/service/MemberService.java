package com.demo.crowd.service;

import com.demo.crowd.entity.MemberPO;

public interface MemberService {
    int getLoginAcctCount(String loginAcct);

    void saveMemberPO(MemberPO memberPO);

    MemberPO getMemberByLoginAcct(String loginAcct);
}
