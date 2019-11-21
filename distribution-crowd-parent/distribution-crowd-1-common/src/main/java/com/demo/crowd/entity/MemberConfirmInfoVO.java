package com.demo.crowd.entity;




public class MemberConfirmInfoVO {
	
	// 用户登录系统后，系统分配的token值，用于识别用户身份。
	// 用户的id可以根据token值查询Redis得到
	private String memberSignToken;

	// 在Redis中临时存储项目数据的token值
	private String projectTempToken;
	
	// 易付宝账号
	private String paynum;

	// 法人身份证号
	private String cardnum;

	public String getMemberSignToken() {
		return memberSignToken;
	}

	public void setMemberSignToken(String memberSignToken) {
		this.memberSignToken = memberSignToken;
	}

	public String getProjectTempToken() {
		return projectTempToken;
	}

	public void setProjectTempToken(String projectTempToken) {
		this.projectTempToken = projectTempToken;
	}

	public String getPaynum() {
		return paynum;
	}

	public void setPaynum(String paynum) {
		this.paynum = paynum;
	}

	public String getCardnum() {
		return cardnum;
	}

	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

	public MemberConfirmInfoVO() {
	}

	public MemberConfirmInfoVO(String memberSignToken, String projectTempToken, String paynum, String cardnum) {
		this.memberSignToken = memberSignToken;
		this.projectTempToken = projectTempToken;
		this.paynum = paynum;
		this.cardnum = cardnum;
	}

	@Override
	public String toString() {
		return "MemberConfirmInfoVO{" +
				"memberSignToken='" + memberSignToken + '\'' +
				", projectTempToken='" + projectTempToken + '\'' +
				", paynum='" + paynum + '\'' +
				", cardnum='" + cardnum + '\'' +
				'}';
	}
}