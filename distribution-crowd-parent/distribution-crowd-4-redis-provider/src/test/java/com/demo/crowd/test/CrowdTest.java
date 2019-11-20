package com.demo.crowd.test;

import com.demo.crowd.redis.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootApplication
public class CrowdTest {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisUtil redisUtil;
    @Test
    public void testSaveValueToRedisByRedisTemplate(){
//        //获取redis操作器
//        ValueOperations<Object, Object> operations = redisTemplate.opsForValue();
//
//        //设置值
//        operations.set("keyOne","valueOne");
        String cat = redisUtil.get("cat");
        System.out.println(cat);
    }
}
