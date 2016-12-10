package com.yoyo.ctrl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yoyo.ctrl.DemoController;
import com.yoyo.service.DemoService;

@Controller
@EnableAutoConfiguration
public class DemoControllerImpl implements DemoController {

//	@Autowired
//	DemoService demoService;
	
	@Override
	@RequestMapping("/")
	public void helloWorld() {
		System.out.println("hello world");
//		demoService.helloWorld();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoControllerImpl.class, args);
	}

}
