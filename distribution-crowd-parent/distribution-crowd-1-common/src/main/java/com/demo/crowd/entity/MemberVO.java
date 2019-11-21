package com.demo.crowd.entity;



public class MemberVO {
	
	private String loginacct;
	
	private String userpswd;
	
	private String phoneNum;
	
	private String randomCode;

	public String getLoginacct() {
		return loginacct;
	}

	public void setLoginacct(String loginacct) {
		this.loginacct = loginacct;
	}

	public String getUserpswd() {
		return userpswd;
	}

	public void setUserpswd(String userpswd) {
		this.userpswd = userpswd;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getRandomCode() {
		return randomCode;
	}

	public void setRandomCode(String randomCode) {
		this.randomCode = randomCode;
	}

	public MemberVO(String loginacct, String userpswd, String phoneNum, String randomCode) {
		this.loginacct = loginacct;
		this.userpswd = userpswd;
		this.phoneNum = phoneNum;
		this.randomCode = randomCode;
	}

	public MemberVO() {
	}

	@Override
	public String toString() {
		return "MemberVO{" +
				"loginacct='" + loginacct + '\'' +
				", userpswd='" + userpswd + '\'' +
				", phoneNum='" + phoneNum + '\'' +
				", randomCode='" + randomCode + '\'' +
				'}';
	}
}