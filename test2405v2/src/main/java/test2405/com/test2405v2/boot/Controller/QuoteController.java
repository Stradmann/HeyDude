package test2405.com.test2405v2.boot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import test2405.com.test2405v2.boot.Service.QuoteService;


@Controller
@RequestMapping("/library")
public class QuoteController {

	@Autowired
	QuoteService service;

	@RequestMapping("/showQuotes")
	public String showCreditCards (Model model) {

		model.addAttribute("quotes", service.findAll());
		return "library/quotes.html";
	}
}