package com.lms.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lms.models.Book;
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
	
	@GetMapping("/getOne")
	public String findOne(@RequestParam long id, HttpServletRequest req) {
		List<Book> books = new ArrayList<>();
		Book b = new Book();
		if(lmsService.findOne(id) != null) {
			//Optional<Book> b = lmsService.findOne(id);
		}
		books.add(b);
		req.setAttribute("books", books);
		return "index";
	}

	//Test du comportement des fichiers avec github

    /*
    Check what's rigth
     */
    @GetMapping("/")
    public void findAll(){
	    //Only for github test
    }

}
