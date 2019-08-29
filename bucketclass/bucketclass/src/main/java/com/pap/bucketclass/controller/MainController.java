package com.pap.bucketclass.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
    public String loginToMain(Principal principal) {
		if(principal != null) {
			System.out.println(principal.getName());
		}else {
			System.out.println("none");
		}
        return "main";
    }
	
}
