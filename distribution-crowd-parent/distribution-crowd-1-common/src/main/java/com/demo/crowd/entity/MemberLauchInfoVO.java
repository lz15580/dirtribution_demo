package com.demo.crowd.entity;



public class MemberLauchInfoVO {
	
	// 用户登录系统后，系统分配的token值，用于识别用户身份。
	// 用户的id可以根据token值查询Redis得到
	private String memberSignToken;

	// 在Redis中临时存储项目数据的token值
	private String projectTempToken;
	
	// 简单介绍
	private String descriptionSimple;
	
	// 详细介绍
	private String descriptionDetail;
	
	// 联系电话
	private String phoneNum;
	
	// 客服电话
	private String serviceNum;

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

	public String getDescriptionSimple() {
		return descriptionSimple;
	}

	public void setDescriptionSimple(String descriptionSimple) {
		this.descriptionSimple = descriptionSimple;
	}

	public String getDescriptionDetail() {
		return descriptionDetail;
	}

	public void setDescriptionDetail(String descriptionDetail) {
		this.descriptionDetail = descriptionDetail;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getServiceNum() {
		return serviceNum;
	}

	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}

	public MemberLauchInfoVO() {
	}

	public MemberLauchInfoVO(String memberSignToken, String projectTempToken, String descriptionSimple, String descriptionDetail, String phoneNum, String serviceNum) {
		this.memberSignToken = memberSignToken;
		this.projectTempToken = projectTempToken;
		this.descriptionSimple = descriptionSimple;
		this.descriptionDetail = descriptionDetail;
		this.phoneNum = phoneNum;
		this.serviceNum = serviceNum;
	}

	@Override
	public String toString() {
		return "MemberLauchInfoVO{" +
				"memberSignToken='" + memberSignToken + '\'' +
				", projectTempToken='" + projectTempToken + '\'' +
				", descriptionSimple='" + descriptionSimple + '\'' +
				", descriptionDetail='" + descriptionDetail + '\'' +
				", phoneNum='" + phoneNum + '\'' +
				", serviceNum='" + serviceNum + '\'' +
				'}';
	}
}