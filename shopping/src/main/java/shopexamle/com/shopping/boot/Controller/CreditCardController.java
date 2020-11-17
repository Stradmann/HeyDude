package shopexamle.com.shopping.boot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import shopexamle.com.shopping.boot.Service.CreditCardService;

@Controller
@RequestMapping("/creditcards")
public class CreditCardController {

	@Autowired
	CreditCardService service;

	@RequestMapping("/show")
	public String showCreditCards (Model model) {

		model.addAttribute("cards", service.findAll());
		return "shopping/cards.html";
	}
}