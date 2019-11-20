package com.demo.crowd.util;

import com.aliyun.api.gateway.demo.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CrowdUtils {
	
	/**
	 * 生成用户登录成功后使用的token
	 * @return
	 * @author 封捷
	 */
	public static String generateToken() {
		
		return CrowdConstant.REDIS_MEMBER_SING_TOKEN_PREFIX + UUID.randomUUID().toString().replaceAll("-", "");
	}
	
    /**
	 * 验证集合是否有效
	 * @param c		待验证集合
	 * @return		验证结果（true：有效，false：无效）
	 * @author 封捷
	 */
	public static <E> boolean collectionEffectiveCheck(Collection<E> c) {
		return (c != null) && (c.size() > 0);
	}
	
	/**
	 * 验证字符串是否有效
	 * @param source	待验证字符串
	 * @return			验证结果（true：有效，false：无效）
	 * @author 封捷
	 */
	public static boolean strEffectiveCheck(String source) {
		return (source != null) && (source.length() > 0);
	}
	
	/**
	 * 生成随机验证码
	 * @param length	验证码长度
	 * @return			生成的验证码
	 * @throws	RuntimeException 验证码长度必须大于0
	 * @author 封捷
	 */
	public static String randomCode(int length) {
		
		if(length <= 0) {
			throw new RuntimeException(CrowdConstant.MESSAGE_RANDOM_CODE_LENGTH_INVALID);
		}
		
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < length; i++) {
			
			// 1.生成随机数
			double doubleRandom = Math.random();
			
			// 2.调整
			int integerRandom = (int) (doubleRandom * 10);
			
			// 3.拼接
			builder.append(integerRandom);
		}
		
		return builder.toString();
	}
	
	/**
	 * 发送验证码短信
	 * @param appcode		阿里云市场中调用API时识别身份的appCode
	 * @param randomCode	验证码值
	 * @param phoneNum		接收验证码短信的手机号
	 */
	public static void sendShortMessage(String appcode, String randomCode, String phoneNum) {
		//调用短信API时发送请求的目标地址
		String host = "https://dxyzm.market.alicloudapi.com";
		//具体功能路径
		String path = "/chuangxin/dxjk";
		//请求方式
		String method = "POST";
		//请求消息头
		Map<String, String> headers = new HashMap<String, String>();
		//最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
		headers.put("Authorization", "APPCODE " + appcode);
		//封装请求参数
		Map<String, String> querys = new HashMap<String, String>();
		//测试可用默认短信模板,测试模板为专用模板不可修改,如需自定义短信内容或改动任意字符,请联系旺旺或QQ726980650进行申请
		querys.put("content", "【创信】你的验证码是：5873，3分钟内有效！");
		querys.put("mobile", phoneNum);
		Map<String, String> bodys = new HashMap<String, String>();

		try {
			/**
			 * 重要提示如下:
			 * HttpUtils请从
			 * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
			 * 下载
			 *
			 * 相应的依赖请参照
			 * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
			 */
			HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
			System.out.println(response.toString());
			//获取response的body
			//System.out.println(EntityUtils.toString(response.getEntity()));
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}


}
