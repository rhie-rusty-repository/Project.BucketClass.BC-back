package com.pap.bucketclass.model;

import java.io.Serializable;

public class LoginModel implements Serializable{
	private String memberId;
	private String memberPassword;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
}
