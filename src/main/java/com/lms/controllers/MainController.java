package com.lms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/helloJSP")
	public String init() {
		return "index";
	}
}
