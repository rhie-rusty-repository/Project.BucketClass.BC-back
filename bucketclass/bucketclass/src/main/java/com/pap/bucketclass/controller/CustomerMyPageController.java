package com.pap.bucketclass.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.model.CustomerMyPageModel;
import com.pap.bucketclass.service.CustomerMyPageService;
import com.pap.bucketclass.service.LocalMemberDetailsService;

@Controller
public class CustomerMyPageController {

	@Autowired
	private CustomerMyPageService customerService;

	@Autowired
	private LocalMemberDetailsService memberDetailsService;

	// 메인에서 이용자가 mypage 버튼을 눌렀을 때 들어오는 경로
//	@PreAuthorize("hasAnyAuthority('READ_MEMBER')")
	@GetMapping(value="/customer/mypage")
	public String CustomerMyPage(Principal principal, ModelMap model) {
		System.out.println(principal.getName());
		Member member = (Member) memberDetailsService.loadUserByUsername(principal.getName());
		model.addAttribute("member", member);
		return "customer-mypage";
	}

	// 이용자가 mypage에 들어와서 개인정보를 수정했을 때 들어오는 경로
//	@PostMapping(value="/customer/mypage", 
//			produces= {
//					MediaType.APPLICATION_JSON_UTF8_VALUE,
//					MediaType.APPLICATION_ATOM_XML_VALUE})
//	@ResponseBody
//	public Member UpdateMypage(@RequestBody CustomerMyPageModel customerModel) {
//		Member member = customerService.updateMember(customerModel);
//		return null;
//	}

}
