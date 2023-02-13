package com.town.townNews.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {
	
	// TODO SpringBoot Logger 설정 하기 !
	
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	TestDao testDao;
	
	@RequestMapping("/")
	public String testMethod() {
		logger.info("Hello World !!!!");
		
		List<Map<String, Object>> testList = testDao.getAllTestData();
		logger.info("TEST DATA : {} " , testList);
		
		return "Hello World !!!";
	}
	
	// Front 연동 테스트
	@RequestMapping("/front")
	public String front() {
		logger.info("/front TEST");		
		
		
		return "Back Connect Test";
	}
	
	
	
}
