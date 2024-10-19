package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
	@GetMapping("/")
	public String getmsg() {
		return "Welcome to the Social Networking API...";
	}
}
