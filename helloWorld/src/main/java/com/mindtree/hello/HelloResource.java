package com.mindtree.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	@RequestMapping("/message")
	public String returnResourceMessage() {
		return "Hello World";
		
	}

}
