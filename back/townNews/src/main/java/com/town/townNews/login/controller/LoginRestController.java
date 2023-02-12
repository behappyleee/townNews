package com.town.townNews.login.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/v1/login")
public class LoginRestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// User 로그인
	@RequestMapping("/user")
	public String loginUser(HttpServletRequest req) {
		logger.info("LoginRestController /v1/login/user REQ : {} ", req);
		
		return null;
	}
	
	
	
	
	
}
