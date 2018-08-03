package com.group.firstBoot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mytest")
public class HelloController {

	@Value("${xyx.name}")
	private String myName;
	
	@RequestMapping("/hello")
	public String fxh() {
		return myName + "HHHH";
	}
}
