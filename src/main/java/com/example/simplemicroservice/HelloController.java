package com.example.simplemicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/say-hello")
	public String sayHello() {
		return "Hello World!!";
	}

    @GetMapping("/greet")
	public String greet() {
		return "Greetings!!";
	}

}