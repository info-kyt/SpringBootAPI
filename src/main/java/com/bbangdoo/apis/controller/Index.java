package com.bbangdoo.apis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello, BBangDoo!!";
	}
}
