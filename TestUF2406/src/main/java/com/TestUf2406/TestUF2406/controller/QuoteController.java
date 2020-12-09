package com.TestUf2406.TestUF2406.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TestUf2406.TestUF2406.service.QuoteService;

@Controller
@RequestMapping("/library")
public class QuoteController {

	@Autowired
	QuoteService service;
	
	@RequestMapping("/showQuotes")
	public String showQuotes(Model model) {
		
		model.addAttribute("quotes", service.findAll());
		
		return "library/quotes.html";
	}
}
