package test2405.com.test2405v2.boot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import test2405.com.test2405v2.boot.Service.BookService;


@Controller
@RequestMapping("/library")
public class BookController {

	@Autowired
	BookService service;

	@RequestMapping("/showBooks")
	public String showBooks(Model model) {

		model.addAttribute("books", service.findAll());
		return "library/books.html";
	}
}