package com.pap.bucketclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.model.SignUpModel;
import com.pap.bucketclass.service.SignUpService;

@Controller
public class SignUpController {

	@Autowired
	private SignUpService signUpService;
	
	@GetMapping("/signup")
	public String loginForm() {
		return "member-register";
	}
	
	@PostMapping(
			path="/signup",
			produces = {
                    MediaType.APPLICATION_JSON_UTF8_VALUE,
                    MediaType.APPLICATION_ATOM_XML_VALUE })
	public String signUp(@RequestBody SignUpModel signup, Member member) {
		
		if(signUpService.insertMember(signup)!=null) {
//			signUpService.checkId(member, signup);
			return "member-login";
		}
		 return "member-register";
	}
	
}