package com.pap.bucketclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/main")
    public String toMain() {
        return "main";
    }
	
	@GetMapping("/")
    public String loginToMain() {
        return "main";
    }
	
}
