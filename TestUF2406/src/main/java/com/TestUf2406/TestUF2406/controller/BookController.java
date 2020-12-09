package com.TestUf2406.TestUF2406.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TestUf2406.TestUF2406.model.Book;
import com.TestUf2406.TestUF2406.service.BookService;

@Controller
@RequestMapping("/Library")
public class BookController {
	
	@Autowired
	BookService service;
	
	@RequestMapping("/showBooks")
	public String showBooks(Model model) {
		
		model.addAttribute("books", service.findAll());
		
		return "library/books.html";
	}
	
	@RequestMapping("/addBook")
	public String addBook (Model model) {
		
		return "library/addBook.html";
	}

	@RequestMapping("/insertBook")
	public String insertBook(Book book, Model model) {
		
		service.insertBook(book);
			
		model.addAttribute("books", service.findAll());
		return "library/books.html";
	}
}
