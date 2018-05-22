package com.lms.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lms.service.LmsService;

@Controller
public class MainController {
	
	@Autowired
	private LmsService lmsService;
	
	@GetMapping("/")
	public String init(HttpServletRequest req) {
		//ModelAndView m = new ModelAndView("index");
		req.setAttribute("mode", "BOOK_VIEW");
		req.setAttribute("books", lmsService.findAllBooks());
		return "index";
	}
	
	@GetMapping("/updateBook")
	public String init(@RequestParam long id, HttpServletRequest req) {
		
		req.setAttribute("mode", "BOOK_EDIT");
		req.setAttribute("book", lmsService.findOne(id));
		return "index";
	}
}
