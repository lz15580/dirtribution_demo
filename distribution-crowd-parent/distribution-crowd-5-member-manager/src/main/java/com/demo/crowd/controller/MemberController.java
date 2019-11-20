package com.demo.crowd.controller;

import com.demo.crowd.api.RedisOperationRemoteService;
import com.demo.crowd.entity.ResultEntity;
import com.demo.crowd.util.CrowdConstant;
import com.demo.crowd.util.CrowdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired
    private RedisOperationRemoteService redisRemoteService;

    @RequestMapping("/member/manager/send/code")
    public ResultEntity<String> sendCode(@RequestParam("phoneNum") String phoneNum){

        if(!CrowdUtils.strEffectiveCheck(phoneNum)){
            return ResultEntity.failed(CrowdConstant.MESSAGE_PHONE_NUM_INVALID);
        }

        //1.生成验证码
        int length = 4;
        String randomCode = CrowdUtils.randomCode(length);

        //2.保存在Redis
        Integer timeOutMinute = 150000000;
        String normalKey = CrowdConstant.REDIS_RANDOM_CODE_PREFIX + phoneNum;
        ResultEntity<String> resultEntity = redisRemoteService.saveNormalStringKeyValue(normalKey, randomCode, timeOutMinute);
        if(ResultEntity.FAILED.equals(resultEntity.getResult())){
            return resultEntity;
        }

        //3.发送验证码
        String appcode = "6614a78e46774d1bb9166ab8e2493414";
        try{
            CrowdUtils.sendShortMessage(appcode,randomCode,phoneNum);
        }catch (Exception e){
            return ResultEntity.failed(e.getMessage());
        }
        return ResultEntity.successNoData();
    }
}
