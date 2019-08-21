package com.pap.bucketclass.service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pap.bucketclass.entity.Member;
import com.pap.bucketclass.entity.Role;
import com.pap.bucketclass.model.SignUpModel;
import com.pap.bucketclass.repository.MemberRepository;
import com.pap.bucketclass.repository.RoleRepository;

@Service
public class SignUpService {

	@Autowired
	private MemberRepository memberRepo;

	@Autowired
	private RoleRepository roleRepo;

//	// ID중복검사
//	public Member checkId(Member member, SignUpModel signup) {
//		System.out.println(">>>ID중복검사실시");
//		if(signup.getMemberId().equals(member.getUsername())) {
//			System.out.println("이미 존재하는 ID");
//			return null;
//		}
//		return memberRepo.save(member);
//	}
//
//	// Email 중복검사
//	public Member checkEmail(Member member, SignUpModel signup) {
//
//		System.out.println(">>>Email중복검사실시");
//		if(signup.getMemberEmail().equals(member.getMemberEmail())) {
//			System.out.println("이미 존재하는 Email");
//			return null;
//		}
//		return memberRepo.save(member);
//	}
//	// NickName 중복검사
//	public Member checkNickname(Member member, SignUpModel signup) {
//
//		System.out.println(">>>Nickname중복검사실시");
//		if(signup.getMemberNickname().equals(member.getMemberNickname())) {
//			System.out.println("이미 존재하는 Nickname");
//			return null;
//		}
//		return memberRepo.save(member);
//	}

	@Transactional
	public Member insertMember(SignUpModel signup) {
		Member member = signup.toMember();
		Role role = roleRepo.findByRoleName(signup.getRoleName());
		member.setRoles(Stream.of(role).collect(Collectors.toSet()));
		member.setMemberIsActive(true);
		return memberRepo.save(member);
	}
}