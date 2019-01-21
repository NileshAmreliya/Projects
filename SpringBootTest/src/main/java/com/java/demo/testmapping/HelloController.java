package com.java.demo.testmapping;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "HI";
	}

	@RequestMapping("/hru")
	public String howAreYou(){
		return "How Are You!!";
	}

}
