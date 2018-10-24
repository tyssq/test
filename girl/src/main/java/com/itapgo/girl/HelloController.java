package com.itapgo.girl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${server.port}")
	private String port;

	@GetMapping(value = {"/hello","/hi"})
	public String say() {
		return port;
	}
} 
