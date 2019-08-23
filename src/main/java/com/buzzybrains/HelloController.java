package com.buzzybrains;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloController {

	@GetMapping
	public String sayHello() {

		return "Welcome to hello world!!";
	}

}
