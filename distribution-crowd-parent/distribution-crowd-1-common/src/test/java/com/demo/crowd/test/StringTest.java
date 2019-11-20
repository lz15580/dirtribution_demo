package com.demo.crowd.test;

import com.demo.crowd.util.CrowdUtils;
import org.junit.Test;

import java.util.UUID;

public class StringTest {
	
	@Test
	public void testUUID() {
		UUID uuid = UUID.randomUUID();
		
		String stringUUID = uuid.toString();
		
		System.out.println(stringUUID);
		
		System.out.println(stringUUID.replaceAll("-", ""));
		
		System.out.println(stringUUID);
	}
	
	@Test
	public void testSendCode() {
		String appcode = "6614a78e46774d1bb9166ab8e2493414";
		String randomCode = CrowdUtils.randomCode(4);
		String phoneNum = "18291486617";
		CrowdUtils.sendShortMessage(appcode, randomCode, phoneNum);
	}

}
