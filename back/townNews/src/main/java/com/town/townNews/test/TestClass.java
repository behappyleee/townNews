package com.town.townNews.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestClass {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/")
	@ResponseBody
	public String testMethod() {
		logger.info("Hello World !!!!");
		
		return "Hello World !!!";
	}
	
}
