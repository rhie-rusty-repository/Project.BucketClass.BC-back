package com.pap.bucketclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pap.bucketclass.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepo;
}
