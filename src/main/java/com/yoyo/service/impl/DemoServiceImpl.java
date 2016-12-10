package com.yoyo.service.impl;

import org.springframework.stereotype.Service;

import com.yoyo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public void helloWorld() {
		System.out.println("hello world");
	}

}
