package com.harshajavatuts.SpringBootRestApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/home")
	public  String helloWorld() {
		return "Hello World Project";
	}

}
