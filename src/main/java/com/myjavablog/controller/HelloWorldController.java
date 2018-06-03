package com.myjavablog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping("/")
	public String getHomePage() {
		return "index";
	}
}
