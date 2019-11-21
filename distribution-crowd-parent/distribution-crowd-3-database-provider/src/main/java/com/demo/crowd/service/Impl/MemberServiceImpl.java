package com.demo.crowd.service.Impl;


import com.demo.crowd.entity.MemberPO;
import com.demo.crowd.entity.MemberPOExample;
import com.demo.crowd.mapper.MemberPOMapper;
import com.demo.crowd.service.MemberService;
import com.demo.crowd.util.CrowdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberPOMapper memberPOMapper;

    @Override
    public int getLoginAcctCount(String loginAcct) {

        MemberPOExample example = new MemberPOExample();

        example.createCriteria().andLoginacctEqualTo(loginAcct);

        return memberPOMapper.countByExample(example);
    }

    @Override
    @Transactional(readOnly=false, propagation=Propagation.REQUIRES_NEW, rollbackFor=Exception.class)
    public void saveMemberPO(MemberPO memberPO) {
        memberPOMapper.insert(memberPO);
    }

    @Override
    public MemberPO getMemberByLoginAcct(String loginAcct) {

        MemberPOExample example = new MemberPOExample();

        example.createCriteria().andLoginacctEqualTo(loginAcct);

        List<MemberPO> list = memberPOMapper.selectByExample(example);

        if(CrowdUtils.collectionEffectiveCheck(list)) {
            return list.get(0);
        }

        return null;
    }
}
