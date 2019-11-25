package com.demo.crowd.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SessionTestHandler {
	
	@RequestMapping("/test/session/save")
	public String testSessionSave(HttpSession session) {
		
		session.setAttribute("attrNameGoodMorning", "attrValueGoodMorning");
		
		return "save completely!";
	}

}
