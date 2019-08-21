package com.pap.bucketclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pap.bucketclass.model.LoginModel;
import com.pap.bucketclass.service.LoginService;

@RestController
public class LoginCotroller {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping(
			path="/login",
			produces = {
					MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE })
	public String login(@RequestBody LoginModel loginModel) {
		if(loginService.loginCheck(loginModel.getMemberId(), loginModel.getMemberPassword())) {
			return "/main";
		}
		return "/login";
	}
}
