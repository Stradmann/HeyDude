package test2405.com.test2405v2.boot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test2405.com.test2405v2.boot.Model.Quote;
import test2405.com.test2405v2.boot.Repository.QuoteRepository;


@Service
public class QuoteService {

	@Autowired
	QuoteRepository repository;

	
	public Iterable<Quote> findAll() {

		return repository.findAll();
	}
}
