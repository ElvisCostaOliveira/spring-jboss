package com.jboss;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/Hello")
	public String sayHello() {
		
		return "Hello Jboss";
	}
}
