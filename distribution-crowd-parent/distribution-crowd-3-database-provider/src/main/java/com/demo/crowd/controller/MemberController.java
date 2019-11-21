package com.demo.crowd.controller;

import com.demo.crowd.entity.MemberPO;
import com.demo.crowd.entity.ResultEntity;
import com.demo.crowd.service.MemberService;
import com.demo.crowd.util.CrowdConstant;
import com.demo.crowd.util.CrowdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/retrieve/member/by/login/acct")
    public ResultEntity<MemberPO> retrieveMemberByLoginAcct(
            @RequestParam("loginAcct") String loginAcct) {

        try {
            MemberPO memberPO = memberService.getMemberByLoginAcct(loginAcct);

            return ResultEntity.successWithData(memberPO);
        } catch (Exception e) {
            e.printStackTrace();

            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping("/retrieve/loign/acct/count")
    public ResultEntity<Integer> retrieveLoignAcctCount(
            @RequestParam("loginAcct") String loginAcct) {

        if(!CrowdUtils.strEffectiveCheck(loginAcct)) {
            return ResultEntity.failed(CrowdConstant.MESSAGE_LOGINACCT_INVALID);
        }

        try {
            int count = memberService.getLoginAcctCount(loginAcct);

            return ResultEntity.successWithData(count);

        } catch (Exception e) {
            e.printStackTrace();

            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping("/save/member/remote")
    public ResultEntity<String> saveMemberRemote(@RequestBody MemberPO memberPO) {

        try {
            // 执行保存
            memberService.saveMemberPO(memberPO);
        } catch (Exception e) {
            e.printStackTrace();

            return ResultEntity.failed(e.getMessage());
        }

        return ResultEntity.successNoData();

    }
}
