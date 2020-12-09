package com.TestUf2406.TestUF2406.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.TestUf2406.TestUF2406.model.Book;
import com.TestUf2406.TestUF2406.model.Quote;
import com.TestUf2406.TestUF2406.service.BookService;
import com.TestUf2406.TestUF2406.service.QuoteService;

@Controller
@RequestMapping("/library")
public class QuoteController {

	@Autowired
	QuoteService service;
	
	@Autowired
	BookService serviceBook;
	
	@RequestMapping("/showQuotes")
	public String showQuotes(Model model) {
		
		model.addAttribute("quotes", service.findAll());
		
		return "library/quotes.html";
	}
	
	@RequestMapping("/addQuote")
	public String addQuote (Model model) {
		
		return "library/addQuote.html";
	}
	
	@RequestMapping(value = "/insertQuote", method = RequestMethod.POST)
	public String insertQuote(Quote quote, Model model, @RequestParam("idBook") Long id) {
		
		System.out.println(id);
		
		Optional<Book> foundBook = serviceBook.findById(id);
	

		// Search for a book with an invalid ID
		
		if (foundBook.isPresent()) quote.setBook(foundBook.get());
		else quote.setBook(null);
		
		service.insertQuote(quote);
		
		
		model.addAttribute("quotes", service.findAll());
		return "library/quotes.html";
	}
}
