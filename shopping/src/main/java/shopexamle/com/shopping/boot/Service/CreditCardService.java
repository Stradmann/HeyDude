package shopexamle.com.shopping.boot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopexamle.com.shopping.boot.Model.CreditCard;
import shopexamle.com.shopping.boot.Repository.CreditCardRepository;

@Service
public class CreditCardService {

	@Autowired
	CreditCardRepository repository;

	
	public Iterable<CreditCard> findAll() {

		return repository.findAll();
	}
}